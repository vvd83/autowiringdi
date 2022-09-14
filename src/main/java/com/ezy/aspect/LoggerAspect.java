package com.ezy.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.ezy.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString()+" started ");
        Object o = joinPoint.proceed();
        logger.info(joinPoint.getSignature().toString()+" ended");
        return o;
    }
}
