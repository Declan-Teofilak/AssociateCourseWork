package com.company;
import java.util.Random;
import java.util.Scanner;

/*1. Write a java program that prints to the screen a countdown 2,4,6,8, and then Who do we appreciate! (hint use a for loop)
        2. Create a java program which prints out a random goodwill message ie (Have a great day!) please have at least 4 messages
        3. Ask the user to enter a number and print out to the screen until the number -3 is entered
        4. Write a JAVA program that calls a method that finds the smaller of two numbers input
*/

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        //assignment one
        int counter[] = {2, 4, 6, 8};
        for (int i = 0; i < 4; i++) {
            System.out.println(counter[i]);
        }
        System.out.println("Who do we appreciate?!");


        //assignment two
        int rando = rand.nextInt(4) + 1;
        switch (rando){
            case 1:
                System.out.println("You can do it!");
                break;
            case 2:
                System.out.println("You've got this!");
                break;
            case 3:
                System.out.println("Way to go!");
                break;
            case 4:
                System.out.print("Have an amazing day!");
                break;
        }

        //assignment three
        int check = 0;
        while (check != -3){
            System.out.println("Please enter a number: ");
            check = scan.nextInt();
            if (check != -3){
                System.out.println(check);
            }
        }

        //assignment four
        int userNum;
        int userNum1;
        int tiny = 0;

        System.out.println("Please input a number: ");
        userNum = scan.nextInt();

        System.out.println("Please input another number: ");
        userNum1 = scan.nextInt();

        tiny = Smallest(userNum, userNum1);

        System.out.println("The smaller of your two numbers is " + tiny);
    }

    public static int Smallest(int a, int b){
        int smaller = 0;
        if (a > b)
        {
            smaller = b;
        }
        else if (b > a)
        {
            smaller = a;
        }

        return smaller;
    }
}
