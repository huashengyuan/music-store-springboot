package com.musicstore.awesome.dao;


import com.musicstore.awesome.dto.UmsAdminParam;

public interface UmsAdminMapper {
    UmsAdminParam getAdminById(String uuid);
}
