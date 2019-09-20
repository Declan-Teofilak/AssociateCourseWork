import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dog[];
        int totaltasks = 0;
        add(dog, totaltasks);
    }

    public int add(String a[], int totaltasks)
    {
        Scanner scan = new Scanner(System.in);
        String task;
        if (totaltasks == 0) {
            System.out.println("Enter your task: ");
            task = scan.next();
            a[totaltasks] = task;
            totaltasks++;
        } else {
            System.out.println("Enter your task: ");
            task = scan.next();
            a[totaltasks + 1] = task;
            totaltasks++;
        }
    }
}
