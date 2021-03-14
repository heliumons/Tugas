package com.upscale.java5.helpers;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Random;

public class Helper {
    public Timestamp now() {
        Instant instant = Instant.now();
        Timestamp timestamp = Timestamp.from(instant);
        return timestamp;
    }

    public Integer randNum(Integer n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }
}
