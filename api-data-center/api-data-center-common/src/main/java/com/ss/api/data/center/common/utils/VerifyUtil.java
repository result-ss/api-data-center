package com.ss.api.data.center.common.utils;

import com.ss.api.data.center.common.enums.CommonErrorCode;
import com.ss.api.data.center.common.exception.BusinessException;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.expression.ExpressionLanguageGroovyImpl;

import java.util.List;


/**
 * @author xueshansheng
 * @date 2019/11/26 上午 11:10
 */
public class VerifyUtil {

    private static Validator validator = new Validator();

    static {
        validator.getExpressionLanguageRegistry().registerExpressionLanguage("groovy",
                new ExpressionLanguageGroovyImpl());
    }

    private VerifyUtil() {
    }

    /**
     * 1、请求参数非空、格式验证，请求对象
     *
     * @param object 请求校验参数
     */
    public static void validateObject(Object object) throws BusinessException {
        List<ConstraintViolation> list = validator.validate(object);
        if (null != list && !list.isEmpty()) {
            throw new BusinessException(CommonErrorCode.PARAMETER_VALID_NOT_PASS.getCode(),
                    list.get(0).getMessage());
        }
    }
}
