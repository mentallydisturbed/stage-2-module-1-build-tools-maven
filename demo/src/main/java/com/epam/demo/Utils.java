package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        for (String s:
             args) {
            if(com.epam.utils.StringUtils.isPositiveNumber(s)){
                return false;
            }
        }
        return true;
    }
}