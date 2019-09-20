package com.company;

class groceries {

    int Almond_Milk = 1;
    int Olive_Oil = 3;


    public groceries()
    {
        System.out.println("We are going grocery shopping!");
    }

    public int getAlmond_Milk()
    {
        return Almond_Milk;
    }
    public int getOlive_Oil()
    {
        return Olive_Oil;
    }
    public void setAlmond_Milk(int newAlmond)
    {
        Almond_Milk = newAlmond;
    }
    public void setOlive_Oil(int newOil)
    {
        Olive_Oil = newOil;
    }
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
