package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String userChoice;
        arr ballAnswers[] = {"It is certain", "As I see it, yes", "It is decidely so", "Without a doubt", "Definitely", "You may rely on it", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Dont count on it", "My reply is no", "Sources say no", "Outlook not so good", "Very doubtful"};

        System.out.println("Hello, welcome to the magic 8-Ball! Shake the ball by typing 's': ");
                userChoice = in.nextLine();

                if (userChoice = "s") {
                    int random = rand.nextInt(19);
                }

                switch (random) {
                    case 0: System.in.println(ballAnswers[random]);
                    case 1: System.in.println(ballAnswers[random]);
                    case 2: System.in.println(ballAnswers[random]);
                    case 3: System.in.println(ballAnswers[random]);
                    case 4: System.in.println(ballAnswers[random]);
                    case 5: System.in.println(ballAnswers[random]);
                    case 6: System.in.println(ballAnswers[random]);
                    case 7: System.in.println(ballAnswers[random]);
                    case 8: System.in.println(ballAnswers[random]);
                    case 9: System.in.println(ballAnswers[random]);
                    case 10: System.in.println(ballAnswers[random]);
                    case 11: System.in.println(ballAnswers[random]);
                    case 12: System.in.println(ballAnswers[random]);
                    case 13: System.in.println(ballAnswers[random]);
                    case 14: System.in.println(ballAnswers[random]);
                    case 15: System.in.println(ballAnswers[random]);
                    case 16: System.in.println(ballAnswers[random]);
                    case 17: System.in.println(ballAnswers[random]);
                    case 18: System.in.println(ballAnswers[random]);
                    case 19: System.in.println(ballAnswers[random]);
                   default: System.in.println(ballAnswers[random]);
                }



    }

    public static int shakeBall(int a) {
        Random rand = new Random();

        int random = rand.nextInt(19);
        return random;
    }
}
