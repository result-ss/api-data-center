package com.ss.api.data.center.manager.aspect;

import com.ss.api.data.center.common.annotation.FirstAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author xueshansheng
 * @date 2020/5/21 下午 5:20
 */
@Aspect
@Component
public class FirstAspect {

    @Pointcut("@annotation(com.ss.api.data.center.common.annotation.FirstAnnotation)")
    public void annotationPointcut() {
    }

    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) {

        System.out.println("准备"+joinPoint);
    }

    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        FirstAnnotation annotation = method.getAnnotation(FirstAnnotation.class);
        String value = annotation.value();
        System.out.println("结束"+value);
    }

}
