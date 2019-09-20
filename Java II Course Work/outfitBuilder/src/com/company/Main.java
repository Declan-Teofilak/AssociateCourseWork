package com.company;

public class Main {
    public static void main(String args[]) {

        int test[] = {12, 2, 3, 4, 5};

        double total = arrayCounter(test);

        System.out.println("The mean of your array is " + total);

    }

    private static double arrayCounter(int[] b) {
        double average = 0;
        int arrayLength = b.length;

        for (int i = 0; i < arrayLength; i++) {
            average = b[i] + average;
        }
        average = average / arrayLength;
        return average;
    }
}