package com.ssm.dao;

import com.ssm.entity.Admin;



public interface AdminDao {
    /**
     * 查询是否有该用户
     * */
    Admin queryByAdmin(Admin admin);

    Admin hasExisted(Admin admin);

    int insertAdmin(Admin admin);

    int updateAdmin(Admin admin);



}
