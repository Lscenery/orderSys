package com.ssm.service;

import com.ssm.entity.User;

import java.util.List;


public interface UserService {
    /**
     * 获取所有的用户
     **/

    List<User> getUsersList();
    /**
     * 通过手机号查询
     * */
    List<User> getUserByPhoneNum(String phoneNum);
    /**
     * 用过姓名模糊查询
     * */
    List<User> getUserByName(String UserName);

    /**
     * 对成员的增删改
     * */
    boolean addUser(User user);

    boolean modifyUser(User user);

    boolean deleteUser(String phoneNum);
}
