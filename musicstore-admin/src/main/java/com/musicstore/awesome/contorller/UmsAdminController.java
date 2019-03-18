package com.musicstore.awesome.contorller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UmsAdminController extends BaseController {

    @RequestMapping(value="/{userId}", method= RequestMethod.GET)
    public Object getUserById(@PathVariable Integer userId) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("statusCode", 200);
        result.put("data", "This is user info for user: [" + userId + "]");
        if (userId.intValue() > 9) {
            // Then the baseController will catch the exception, and handle it.
            int a = 1 / 0;
        }
        return ResponseEntity.ok(result);
    }
}
