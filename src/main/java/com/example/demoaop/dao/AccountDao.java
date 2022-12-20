package com.example.demoaop.dao;

import com.example.demoaop.model.Account;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccountDao {
    public void addAccount(Account account) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT");

    }
    public void addAccount(Account account, boolean isAdded) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT AND CHECK IT");

    }

    public String doSmth(String text) {
        return "hello";
    }
}
