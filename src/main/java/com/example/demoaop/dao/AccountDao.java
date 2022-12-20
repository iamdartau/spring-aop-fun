package com.example.demoaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT");

    }
}
