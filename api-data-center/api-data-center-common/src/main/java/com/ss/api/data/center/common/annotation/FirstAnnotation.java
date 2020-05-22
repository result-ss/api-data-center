package com.ss.api.data.center.common.annotation;

import java.lang.annotation.*;

/**
 * @author xueshansheng
 * @date 2020/5/21 下午 5:12
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FirstAnnotation {

    String value() default "";
}
