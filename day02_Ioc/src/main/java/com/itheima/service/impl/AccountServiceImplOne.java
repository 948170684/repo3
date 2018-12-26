package com.itheima.service.impl;

import com.itheima.service.AccountService;

import java.util.*;

public class AccountServiceImplOne implements AccountService {
    private String username;
    private Integer password;
    private char[] myarry;
    private List<String> mylist;
    private Map<Integer,String> map;
    private Properties properties;
    private String[] str;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public char[] getMyarry() {
        return myarry;
    }

    public void setMyarry(char[] myarry) {
        this.myarry = myarry;
    }

    public List<String> getMylist() {
        return mylist;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public AccountServiceImplOne() {
    }

    public AccountServiceImplOne(String username, Integer password, char[] myarry, List<String> mylist, Map<Integer, String> map, Properties properties) {
        this.username = username;
        this.password = password;
        this.myarry = myarry;
        this.mylist = mylist;
        this.map = map;
        this.properties = properties;
    }



    @Override
    public void saveAccount() {
        System.out.println("this is One");
        System.out.println("AccountServiceImplOne{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", myarry=" + Arrays.toString(myarry) +
                ", mylist=" + mylist +
                ", map=" + map +
                ", properties=" + properties +
                ", str=" + Arrays.toString(str) +
                ", birthday=" + birthday +
                '}');
    }
}
