package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter two numbers and I'll tell you which is bigger!: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

      larger(num1, num2);

      System.out.println("Awesome, now enter a third number: ");
      num3 = scan.nextInt();
      float theAverage = average(num1, num2, num3);
      System.out.print("The average of your three numbers is " + theAverage);
      System.out.println();
      System.out.println();

        int finalMulti[][] = {{6, 2, 3}, {4, 9, 6}};
        for (int i = 0; i < finalMulti.length; i++) {
            for (int j = 0; j < finalMulti[i].length; j++) {
                System.out.print(finalMulti[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void larger(int a, int b){
        if(a > b){
            System.out.println(a + " is bigger than " + b);
        }
        else
        {
         System.out.println(b + " is bigger than " + a);
        }
    }
    public static float average(int a, int b, int c){
        float total = (a + b + c)/3;
        return total;
    }
}
