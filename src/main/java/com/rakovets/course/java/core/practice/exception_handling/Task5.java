package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public static void arithmetic2 (String x) throws CustomRuntimeException {
        int y;
        try {
           y = Integer.parseInt(x);
        } catch (IllegalArgumentException cust) {
            throw new CustomRuntimeException(cust.getMessage());
        }
    }
}
