package com.myorg.orderservice;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Date dt = new Date(time);

        System.out.println(dt);
    }
}
