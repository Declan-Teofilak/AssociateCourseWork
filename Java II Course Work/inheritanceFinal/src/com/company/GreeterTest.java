package com.company;

public class GreeterTest extends GreetingBot {
    public static void main(String[] args) {
        GreetingBot bot = new GreetingBot();
        bot.badMood();
        bot.goodMood();
        HowdyBot hello = new HowdyBot();
        hello.howdy();
        hello.goodMood();
    }
}
