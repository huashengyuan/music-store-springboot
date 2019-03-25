package com.musicstore.admin.component;

import com.musicstore.admin.Util.JwtHelper;
import com.musicstore.admin.service.AdminService;
import com.musicstore.common.model.Admin;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    private Audience audience;

    @Autowired
    private AdminService adminService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final String authHeader = request.getHeader("authorization");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        } else {
            if (null == authHeader || !authHeader.startsWith("bearer;")) {
                throw new LoginException("Login error");

            }
        }
        final String token = authHeader.substring(7);
        try {
            final Claims claims = JwtHelper.parseJWT(token, audience.getBase64Secret());
            if (claims == null) {
                throw new LoginException("Login error");
            }
            Date expireDate = claims.getExpiration();
            if (expireDate.before(new Date())) {
                String username = claims.get("unique_name", String.class);
                Admin admin = adminService.findAdminByUsername(username);
                if (admin == null) {
                    throw new LoginException("Login error");
                }
            } else {
                throw new LoginException("Login error");
            }

            request.setAttribute("CLAIMS", claims);
            return true;
        } catch (final Exception e) {
            throw new LoginException("Login error");
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
