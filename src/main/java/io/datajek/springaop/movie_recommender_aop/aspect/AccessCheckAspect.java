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

//    @Before("execution(* io.datajek.springaop.movie_recommender_aop.business.*.*(..))")
//    public void userAccess(JoinPoint joinPoint){
//        logger.info("Intercepted call before execution: {}", joinPoint );
//    }

    //@Before("execution(* io.datajek.springaop.movie_recommender_aop..*.*(..))") // intercept all packages' all classes
    //  @Before("execution(String io.datajek.springaop.movie_recommender_aop..*.*(..))") // intercept which returns String
   // @Before("execution(* io.datajek.springaop.movie_recommender_aop..*.*(String,..)) ||" +
   //         " execution(String io.datajek.springaop.movie_recommender_aop..*.*(..))") // intercept which return String or have String as 1st argument
    public void before(JoinPoint joinPoint){
        logger.info("Intercepted call before execution: {}", joinPoint );
    }
}
