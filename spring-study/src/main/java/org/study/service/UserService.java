package org.study.service;


import org.study.dao.UserDao;

public interface UserService {

    public void setUserDao(UserDao userDao);

    public void add();
}
