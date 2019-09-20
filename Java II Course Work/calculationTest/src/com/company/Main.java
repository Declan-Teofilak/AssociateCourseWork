package com.company;

public class Main {
    int z;

    public void addition(int a, int b){
        z = a + b;
        System.out.println("The sum of your given numbers is: " + z);
    }
    public void Subtraction(int x,int y){
        z = x-y;
        System.out.println("The difference between the given numbers:"+z);
    }
    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
        my_calc m = new my_calc();
	m.divide(a, b);
    }
}
