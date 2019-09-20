package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        FileOutputStream saveFile = new FileOutputStream("bankInfo.sav");
        ObjectOutputStream save = new ObjectOutputStream(saveFile);

        Scanner in = new Scanner(System.in);

        String options[] = {"1. Checking", "2. Savings", "3. Deposit", "4. Withdrawal"};
        String name;
        String pass;
        int chBalance = 0;
        int response;
        int checkingTotal;
        int savingsTotal;
        int deposit;
        int withdrawal;


        System.out.println("Hello, welcome to our banking simulation! Please enter your pin to begin: ");

        pass = in.nextLine();
        save.writeObject(pass);

        save.close();

        /*
        System.out.println("Alright, you now have set up your pin! What would you like to do next?: ");
        Menu(in.nextInt());

        }
    }
    public static void Checking() {
        System.out.println("Okay, your checking balanace is: ");
        System.out.print(chBalance);
    }
    public static void Menu(int response){



        System.out.println(options[0]);
        System.out.println(options[1]);
        System.out.println(options[2]);
        System.out.println(options[3]);

        response = in.nextInt();

        switch (response) {
            case 1: Checking();
            case 2: //run function;
            case 3: //run function;
            case 4: //run function;
    }
    */
}

