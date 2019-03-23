package com.musicstore.admin.service.impl;

import com.musicstore.admin.dao.AdminMapper;
import com.musicstore.admin.service.AdminService;
import com.musicstore.common.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findAdminByUsername(String username) {
        Admin admin = adminMapper.getAdminByUsername(username);
        return admin;
    }
}
