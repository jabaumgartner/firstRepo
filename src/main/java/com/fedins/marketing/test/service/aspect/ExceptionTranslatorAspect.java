package com.fedins.marketing.test.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.fedins.spring.aop.exception.ExceptionTranslator;

@Component("marketing_test_service_exception_aspect")
@Aspect
public class ExceptionTranslatorAspect extends ExceptionTranslator {

	public ExceptionTranslatorAspect() {
//		this.setBaseExceptionClass(AccountInquiryServiceException.class);
//		this.setExceptionClass(GeneralAccountInquiryServiceException.class);
	}

	@Override
	@Around("AspectConfig.inService()")
	public Object exceptionTranslator(ProceedingJoinPoint joinPoint)
			throws Throwable {
		return super.exceptionTranslator(joinPoint);
	}

}
