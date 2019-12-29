package com.gyx.service.impl;

import com.gyx.dao.UserDao;
import com.gyx.pojo.Boss;
import com.gyx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public Boolean updateUserinfo(Boss boss) {

        return userDao.update(boss) > 0;
    }

    @Override
    public Boolean deletUser(Boss boss) {

        return userDao.delete(boss) > 0;
    }
}
