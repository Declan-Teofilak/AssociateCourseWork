package com.company;

public class pantry extends groceries
{
    int peanutButter = 5;
    int pasta = 3;

    pantry() {
    super();
    }
    public int getpeanutButter(){
        return peanutButter;
    }
    public int getpasta(){
        return pasta;
    }
    public void setpeanutButter(int newPeanutButter){
        peanutButter = newPeanutButter;
    }
    public void setpasta(int newpasta){
        pasta = newpasta;
    }
}
