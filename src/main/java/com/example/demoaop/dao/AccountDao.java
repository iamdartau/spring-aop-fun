package com.example.demoaop.dao;

import com.example.demoaop.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@ToString
public class AccountDao {

    public List<Account> findAccounts(){
        List<Account> accounts= new ArrayList<>();
        accounts.add(new Account("1","2"));
        accounts.add(new Account("1","2"));
        accounts.add(new Account("1","2"));
        return accounts;
    }
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
