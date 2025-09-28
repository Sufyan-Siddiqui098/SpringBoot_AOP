package io.datajek.springaop.movie_recommender_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* io.datajek.springaop.movie_recommender_aop.business.*.*(..))")
    public void userAccess(JoinPoint joinPoint){
        logger.info("Intercepted call before execution: {}", joinPoint );
    }


}
