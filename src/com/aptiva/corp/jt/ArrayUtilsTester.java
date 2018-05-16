package com.aptiva.corp.jt;

import java.util.Arrays;
import java.util.List;

public class ArrayUtilsTester {

    public static void main(String[] args) {
        // Base array for the example. It contains 9 elements.

        int[] integerArray = {6,3,4,7,4,45,3,56,354,45};
        String sout = Arrays.toString(integerArray);
        System.out.println(integerArray.length);
//        System.out.println(integerArray);
        System.out.println("toString"+ sout);

        System.out.println(Arrays.toString(integerArray));
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        System.out.println(Arrays.binarySearch(integerArray, 45));
        System.out.println(Arrays.binarySearch(integerArray, 105));

        int[] copiedArray = Arrays.copyOf(integerArray,20);
        int[] copied2 = Arrays.copyOfRange(integerArray, 2,5);

        System.out.println(Arrays.toString(copiedArray));
        System.out.println(Arrays.toString(copied2));

        Arrays.fill(copiedArray, 12);

        System.out.println(Arrays.toString(copiedArray));
    }
}
