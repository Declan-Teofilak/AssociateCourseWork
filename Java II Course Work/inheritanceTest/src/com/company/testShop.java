package com.company;

public class testShop extends groceries {
    public static void main(String[] args) {
        groceries shop = new groceries();
        shop.getAlmond_Milk();
        shop.setOlive_Oil(4);
        shop.getOlive_Oil();
        shop.setAlmond_Milk(0);
        pantry have = new pantry();
        have.getpasta();
        have.getpeanutButter();
        have.setpeanutButter(99);
        have.setpasta(5);
    }
}
