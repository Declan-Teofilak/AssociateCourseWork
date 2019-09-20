package com.company;

public class Main {

    public static void main(String[] args) {
        int firstMulti[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < firstMulti.length; i++) {
            for (int j = 0; j < firstMulti[i].length; j++) {
                System.out.print(firstMulti[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
