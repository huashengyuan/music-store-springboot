package com.musicstore.admin.service;

import com.musicstore.common.model.Admin;

public interface AdminService {
    Admin findAdminByUsername(String username);
}
