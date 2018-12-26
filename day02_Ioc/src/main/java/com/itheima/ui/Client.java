package com.itheima.ui;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImplOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
       /* AccountService bean = (AccountService) as.getBean("AccountService");
        bean.saveAccount();*/
        AccountServiceImplOne dao = as.getBean("AccountOne", AccountServiceImplOne.class);
        dao.saveAccount();
        System.out.println(dao);
        AccountServiceImplOne dao1 = as.getBean("AccountOne", AccountServiceImplOne.class);

        System.out.println(dao1);
    }
}
