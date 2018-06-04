package com.fedins.marketing.test.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.fedins.spring.aop.validation.ValidationAdvice;

@Component("marketing_test_service_validation_aspect")
@Aspect
public class ValidationAspect extends ValidationAdvice {

	public ValidationAspect() {
		//this.setValidationExceptionClass(InvalidInputException.class);
	}

	@Override
	@Around("AspectConfig.inService()")
	public Object processValidation(ProceedingJoinPoint jp) throws Throwable {
		return super.processValidation(jp);
	}

}
