package com.example.demoaop.aspect;

import com.example.demoaop.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class OtherAspect {

    @Pointcut("execution(* com.example.demoaop.dao.*.*(..))")
    private void pointcutForPackage() {}
    @Before("pointcutForPackage()")
    public void beforeAddAccount(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
            if (arg instanceof Account){
                Account account = (Account) arg;
                System.out.println(account.getName());
                System.out.println(account.getLevel());
            }
        }
    }


}
