package com.musicstore.admin.controller;

import com.musicstore.admin.error.BusinessException;
import com.musicstore.admin.error.EmBusinessError;
import com.musicstore.admin.util.CommonReturnType;
import com.musicstore.admin.util.JwtHelper;
import com.musicstore.admin.util.MD5Util;
import com.musicstore.admin.component.Audience;
import com.musicstore.admin.service.AdminService;
import com.musicstore.common.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@RestController
public class AdminController extends BaseController {

    @Autowired
    private Audience audience;

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonReturnType login(@RequestParam(value = "username", required = true) String username,
                                  @RequestParam(value = "password", required = true) String password) throws LoginException, BusinessException {
        Admin admin = adminService.findAdminByUsername(username);

        if (admin == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }

        String encPassword = MD5Util.encryptToMD5(password);
        if (!encPassword.equals(admin.getPassword())) {
            throw new LoginException("Username or password invalid");
        }

        String jwtToken = JwtHelper.createJWT(admin.getUsername(), admin.getUuid(), admin.getRole(), audience.getName(), audience.getClientId(),audience.getExpiresSecond() * 1000, audience.getBase64Secret());
        jwtToken = "bearer;" + jwtToken;

        //返回通用对象
        return CommonReturnType.create(jwtToken);
    }
}
