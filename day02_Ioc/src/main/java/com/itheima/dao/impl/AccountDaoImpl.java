package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("AccountDao");
        System.out.println("saved success");
    }
}
