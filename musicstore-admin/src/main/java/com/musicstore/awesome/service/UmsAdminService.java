package com.musicstore.awesome.service;

import com.musicstore.awesome.dto.UmsAdminParam;

public interface UmsAdminService {
    UmsAdminParam getAdminByUuid(String uuid);
}
