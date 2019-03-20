package com.musicstore.awesome.service.impl;

import com.musicstore.awesome.dao.UmsAdminMapper;
import com.musicstore.awesome.dto.UmsAdminParam;
import com.musicstore.awesome.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdminParam getAdminByUuid(String uuid) {
        UmsAdminParam umsAdminParam = umsAdminMapper.getAdminById(uuid);

        return umsAdminParam;
    }
}
