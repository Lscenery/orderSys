package com.ssm.service;


import com.ssm.entity.Admin;

public interface AdminService {
    Admin findAdmin(Admin admin);

    Admin hasExisted(Admin admin);


    boolean addAdmin(Admin admin);

    boolean modifyAdmin(Admin admin);

}
