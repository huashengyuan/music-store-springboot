package com.musicstore.awesome.contorller;

import com.musicstore.awesome.dto.UmsAdminParam;
import com.musicstore.awesome.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UmsAdminController extends BaseController {

    @Autowired
    private UmsAdminService umsAdminService;

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

    @RequestMapping(value = "/adminTest/{uuid}", method = RequestMethod.GET)
    public UmsAdminParam getAdminByUuid(@PathVariable String uuid) {
        UmsAdminParam umsAdminParam = umsAdminService.getAdminByUuid(uuid);

        return umsAdminParam;
    }
}
