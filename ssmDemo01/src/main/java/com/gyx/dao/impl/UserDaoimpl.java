package com.gyx.dao.impl;

import com.gyx.dao.UserDao;
import com.gyx.pojo.Boss;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements UserDao {

    @Override
    public int update(Boss boss) {

        System.out.println("成功修改用户信息");

        //
        return 1;
    }

    @Override
    public int delete(Boss boss) {

        System.out.println("成功删除用户信息");

        //
        return 1;
    }
}
