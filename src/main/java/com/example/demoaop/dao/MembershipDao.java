package com.example.demoaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public void addAccount(){
        System.out.println(getClass() + " MEMBERSHIP Add ACCOUNT");
    }

    public boolean isAdded(){
        return true;
    }
}
