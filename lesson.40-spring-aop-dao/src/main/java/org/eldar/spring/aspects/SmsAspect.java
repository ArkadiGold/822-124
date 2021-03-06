package org.eldar.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SmsAspect {

	@Before("MyPointcuts.allDaoPackageExcludeGetSet()")
	public void smsAdvice(JoinPoint jp) {
		System.out.println("===>>> sms advice before method: " + jp.getSignature());
	}
}
