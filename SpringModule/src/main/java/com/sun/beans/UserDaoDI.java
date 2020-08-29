package com.sun.beans;

import com.sun.dao.IUserDao;
import org.junit.jupiter.api.Test;

/**
 * @author sunjun
 * @create 2020-08-28 11:16
 */
public class UserDaoDI {
    IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        userDao.add();
    }
}
