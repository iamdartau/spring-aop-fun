package com.example.demoaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("execution(public void com.example.demoaop.dao.AccountDao.addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n========> @Before advice on addAccount()");
    }

    @Before("execution(public void addAccount())")
    public void beforeAllAddAccountAdvice(){
        System.out.println("\n========> @Before advice on ALL addAccount()");
    }

    @Before("execution(public void add*())")
    public void beforeAnyAdd(){
        System.out.println("\n == == ==> ANY add*()");
    }
}
