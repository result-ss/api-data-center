package com.ss.api.data.center.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author xueshansheng
 * @date 2020/5/7 下午 6:16
 */
@Setter
@Getter
@ToString
public class ApiBaseInfoDO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 接口路径
     */
    private String url;

    /**
     * 接口名称
     */
    private String apiName;

    /**
     * 接口服务
     */
    private String apiService;

    /**
     * 请求参数
     */
    private String requestDTO;

    /**
     * 请求方法
     */
    private String requestMethod;

    /**
     * 接口状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 每页条数
     */
    private Integer pageCount;

    /**
     * 开始行
     */
    private Integer startRow;

    /**
     * 开始行
     */
    public Integer getStartRow() {
        if (null == currentPage || null == pageCount) {
            return 0;
        }
        return (currentPage - 1) * pageCount;
    }

}
