package com.example.demoaop;

import com.example.demoaop.dao.AccountDao;
import com.example.demoaop.dao.MembershipDao;
import com.example.demoaop.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        List<Account> accounts = accountDao.findAccounts();
        accounts.forEach(System.out::println);
        context.close();
    }

}
