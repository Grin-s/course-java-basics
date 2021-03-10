package com.rakovets.course.java.core.practice.concurrent.utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ImprovedParallelCalculatorTest {

    @Test
    void getSum() {

        int[] array1 = new int[]{5, 8, 3,};
        int[] array2 = new int[]{2, 11, 6,};
        int[] array3 = new int[]{7, 9, 1,};

        List<int[]> list = new ArrayList<>();
        Collections.addAll(list, array1, array2, array3);

        Map<int[], Integer> expectedResult = new HashMap<>();
        expectedResult.put(array1, 16);
        expectedResult.put(array2, 19);
        expectedResult.put(array3, 17);

        Map<int[], Integer> actualResult = ImprovedParallelCalculator.getSum(list);

        Assertions.assertEquals(expectedResult.entrySet(), actualResult.entrySet());
    }

    @Test
    void ParallelCalculator() {

        int[] array1 = new int[]{5, 8, 3,};
        int[] array2 = new int[]{2, 11, 6,};
        int[] array3 = new int[]{7, 9, 1,};

        List<int[]> list = new ArrayList<>();
        Collections.addAll(list, array1, array2, array3);

        Map<int[], Integer> expectedResult = new HashMap<>();
        expectedResult.put(array1, 16);
        expectedResult.put(array2, 19);
        expectedResult.put(array3, 17);

        Map<int[],Integer> actualResult = ImprovedParallelCalculator.fewThreads(list, 10);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }

        Assertions.assertEquals(expectedResult.entrySet(), actualResult.entrySet());
    }
}