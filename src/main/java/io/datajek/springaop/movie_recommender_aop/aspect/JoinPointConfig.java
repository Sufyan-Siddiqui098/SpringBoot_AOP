package io.datajek.springaop.movie_recommender_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JoinPointConfig {

    @Pointcut("execution(* io.datajek.springaop.movie_recommender_aop.business.*.*(..))")
    public void businessLayerPointcut(){}

    @Pointcut("bean(movie)")
    public void movieBeanPointcut(){}

    @Pointcut("@annotation(io.datajek.springaop.movie_recommender_aop.aspect.MeasureTime)")
    public void measureTimePointcut(){}
}
