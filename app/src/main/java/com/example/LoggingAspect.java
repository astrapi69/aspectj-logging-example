package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Pointcut to intercept any method call in the application
    @Before("execution(* com.example..*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        // Log the method signature and arguments
        logger.info("Method called: " + joinPoint.getSignature());
    }
    @Before("execution(* com.example.SampleService.*(..))")
    public void logBeforeClassMethods(JoinPoint joinPoint) {
        logger.info("Class method called: " + joinPoint.getSignature());
    }
    @Before("execution(* com.example..*(..))")
    public void logBeforePackageMethods(JoinPoint joinPoint) {
        logger.info("Package method called: " + joinPoint.getSignature());
    }

}