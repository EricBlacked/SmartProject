package com.sun.dao.impl;

import com.sun.dao.IUserDao;

/**
 * @author sunjun
 * @create 2020-08-28 10:47
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void add() {
        System.out.println("我是第一个实现类");
    }
}
