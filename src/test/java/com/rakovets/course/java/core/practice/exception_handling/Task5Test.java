package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    void arithmetic2() {
        String x = "123q";
        String actualMessage = "";
        String expectedMessage = "";

        try {
           int y = Integer.parseInt(x);
        } catch (IllegalArgumentException expect) {
            expectedMessage = expect.getMessage();
        }

        try {
            Task5.arithmetic2(x);
        } catch (CustomRuntimeException actual) {
            actualMessage = actual.getMessage();
        }

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
