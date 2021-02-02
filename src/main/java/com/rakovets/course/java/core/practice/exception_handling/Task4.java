package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
    public static int arithmetic (int x, int y) throws CustomRuntimeException {
        if (x == 0 || y == 0) {
            throw new CustomRuntimeException("You just divided by '0'");
        }
        return x / y;
    }
}
