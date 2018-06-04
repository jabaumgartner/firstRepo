package com.fedins.marketing.test.service.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration("marketing_test_service_aspect_config")
@EnableAspectJAutoProxy
@Aspect
public class AspectConfig {
	@Pointcut("execution(public * com.fedins.marketing.test.service.*.*(..)) and @within(org.springframework.stereotype.Service)")
    public void inService(){}
}
