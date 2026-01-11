package org.java_fundamentals._14_jdbc._02_employeeApp.util;

public class StringUtil {
    public static boolean isBlank(String s){
        return s == null || s.trim().isBlank();
    }
}
