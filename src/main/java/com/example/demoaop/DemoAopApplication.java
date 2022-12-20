package com.example.demoaop;

import com.example.demoaop.dao.AccountDao;
import com.example.demoaop.dao.MembershipDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);
        accountDao.addAccount();
        membershipDao.addAccount();
        context.close();
    }

}
