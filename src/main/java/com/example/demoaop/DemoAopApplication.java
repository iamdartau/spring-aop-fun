package com.example.demoaop;

import com.example.demoaop.dao.AccountDao;
import com.example.demoaop.dao.MembershipDao;
import com.example.demoaop.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);
        accountDao.addAccount(new Account("Alex", "max"));
        membershipDao.addAccount();
        System.out.println(membershipDao.isAdded());
        System.out.println(accountDao.doSmth("hi"));
        context.close();
    }

}
