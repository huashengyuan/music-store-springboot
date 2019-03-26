package com.musicstore.admin.util;

import java.util.UUID;

public class GenerateUuid {

    public static String getUUID32() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }
}
