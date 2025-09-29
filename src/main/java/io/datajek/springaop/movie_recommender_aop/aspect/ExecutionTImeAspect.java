package io.datajek.springaop.movie_recommender_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ExecutionTImeAspect {
    private Logger  logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* io.datajek.springaop.movie_recommender_aop..*.*(..))")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object resultValue = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("The time taken by {} to complete execution is : {}", joinPoint, timeTaken);
        // value return by intercepted method.
        return resultValue;
    }
}
