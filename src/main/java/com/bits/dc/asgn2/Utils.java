package com.bits.dc.asgn2;

import java.util.Random;

public class Utils {

    public static long getRandomLong(long min, long max) {
        Random random = new Random();
        return random.nextLong(max - min) + min;
    }

}
