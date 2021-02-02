package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task4.arithmetic(1, 0));
        } catch (CustomRuntimeException run) {
            run.printStackTrace(System.out);
        }
    }
}
