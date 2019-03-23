package com.musicstore.admin.controller;

import com.musicstore.admin.Util.JwtHelper;
import com.musicstore.admin.Util.MD5Util;
import com.musicstore.admin.component.Audience;
import com.musicstore.admin.service.AdminService;
import com.musicstore.common.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@RestController
public class AdminController {

    @Autowired
    private Audience audience;

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestParam(value = "username", required = true) String username,
                         @RequestParam(value = "password", required = true) String password) throws LoginException {
        Admin admin = adminService.findAdminByUsername(username);

        if (admin == null) {
            throw new LoginException("Admin not exist");
        }

        String encPassword = MD5Util.encryptToMD5(password);
        if (!encPassword.equals(admin.getPassword())) {
            throw new LoginException("Username or password invalid");
        }

        String jwtToken = JwtHelper.createJWT(admin.getUsername(), admin.getUuid(), admin.getRole(), audience.getName(), audience.getClientId(),audience.getExpiresSecond() * 1000, audience.getBase64Secret());
        jwtToken = "bearer;" + jwtToken;

        return jwtToken;
    }
}
