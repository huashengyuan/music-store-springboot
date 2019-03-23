package com.musicstore.admin.dao;

import com.musicstore.common.model.Admin;

public interface AdminMapper {

    Admin getAdminByUsername(String username);
}
