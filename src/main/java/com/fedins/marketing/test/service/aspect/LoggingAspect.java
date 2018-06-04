package com.fedins.marketing.test.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.fedins.spring.aop.exception.ExceptionLogger;

@Component("marketing_test_service_logging_aspect")
@Aspect
public class LoggingAspect extends ExceptionLogger {

	public LoggingAspect() {
		super();
	}

	@Override
	@AfterThrowing(pointcut = "AspectConfig.inService()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Throwable ex)
			throws Throwable {
		super.afterThrowing(joinPoint, ex);
	}

}
