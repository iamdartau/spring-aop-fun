package com.example.demoaop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.example.demoaop.dao.*.*(..))")
    private void pointcutForPackage() {}
    @Pointcut("execution(* com.example.demoaop.dao.*.get*(..))")
    private void getterExclude(){}
    @Order(3)
    @Before("pointcutForPackage()")
    public void before(){
        System.out.println("BEFORE ALL FRO PACKAGE WITH POINTCUT");
    }
    @Order(2)
    @Before("pointcutForPackage()")
    public void performSmth(){
        System.out.println("\n===>           performSmth            <===");
    }

    @Order(1)
    @Before("pointcutForPackage() || (getterExclude())")
    public void performSmthButGetter(){
        System.out.println("\n===>performSmth BUT Getters<===");
    }
    /*@Before("execution(* add*(com.example.demoaop.model.Account))")
    public void beforeAddAccount(){
        System.out.println("BEFORE ADD ACCOUNT");
    }*/

    /*@Before("execution(* com.example.demoaop.dao.*.*(..))")
    public void beforeAddAccountWithParams(){
        System.out.println("BEFORE ALL FROM PACKAGE");
    }*/

    /*@Before("execution(public void com.example.demoaop.dao.AccountDao.addAccount())")
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

    @Before("execution(boolean com.example.demoaop.dao.MembershipDao.is*())")
    public void beforeAnyBoolean(){
        System.out.println("BOOLEAN BEFORE");
    }

    @After("execution(String doSmth(..))")
    public void smthAdvice(){
        System.out.println("HI");
    }*/
}
