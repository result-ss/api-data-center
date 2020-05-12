package com.ss.api.data.center.manager.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author xueshansheng
 * @date 2020/5/12 上午 10:55
 */
@Slf4j
@Component
public class RedisManager {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 判断redis中是否具有某个key
     *
     * @param key
     * @return
     */
    public boolean hasKey(String key) {

        return redisTemplate.hasKey(key);
    }

    /**
     * 查询redis数据库，数据类型key-value形式
     *
     * @param keyEnum
     * @return
     */
    public String queryObjectByKey(final String keyEnum) {
        log.info("queryObjectByKey request：{}", keyEnum);
        String resultStr = (String) redisTemplate.execute((RedisCallback<Object>) connection -> {
            byte[] redisKey = redisTemplate.getStringSerializer().serialize(keyEnum);
            if (connection.exists(redisKey)) {
                byte[] value = connection.get(redisKey);
                return redisTemplate.getStringSerializer().deserialize(value);
            }
            return null;
        });
        log.debug("查询redis，key-value result：{}", resultStr);
        return resultStr;
    }

    /**
     * 插入redis数据库,设置有效期，数据类型key-value形式
     *
     * @param key
     * @param value
     * @param timeout
     * @return
     */
    public boolean insertObject(String key, Object value, Long timeout) {
        if (value == null || key == null) {
            return false;
        }
        log.debug("插入redis，req：key={}，value={}", key, value);
        String str = JSONObject.toJSONString(value);
        try {
            if (timeout > 0) {
                redisTemplate.boundValueOps(key).set(str, timeout, TimeUnit.SECONDS);
            } else {
                redisTemplate.boundValueOps(key).set(str);
            }
        } catch (Exception e) {
            log.error("插入redis，key:{}异常信息:{}", key, Throwables.getStackTraceAsString(e));
            return false;
        }
        return true;
    }

    /**
     * 删除redis保存对象，数据类型key-value形式
     *
     * @param key
     * @return
     */
    public boolean deleteObject(final String key) {
        Boolean result = Boolean.FALSE;
        log.debug("删除redis，key：{}", key);
        try {
            result = redisTemplate.delete(key);
        } catch (Exception e) {
            log.error("删除redis，key:{}异常信息：{}", key, Throwables.getStackTraceAsString(e));
        }
        log.debug("删除redis响应：{}");
        return result;
    }

}
