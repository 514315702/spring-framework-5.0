package org.study.service;


import org.study.dao.UserDao;

public class UserServiceImpl {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...............");
    }
}
