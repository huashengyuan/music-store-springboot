package com.musicstore.awesome.contorller;

import org.omg.CORBA.ServerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object ExceptionHandler(HttpServletRequest request, Exception exception) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("statusCode", 500);
        result.put("data", "Unknown Exception!");
        return result;
    }
}
