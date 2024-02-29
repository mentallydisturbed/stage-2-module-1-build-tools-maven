package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if(!org.apache.commons.lang3.math.NumberUtils.isCreatable(str)) {
            return false;
        }
        if(str.charAt(0) == '0' || str.charAt(0) == '-') return false;
        return true;
    }
}
