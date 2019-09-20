/**
 * Program that allows the user to create a number of up to eight digits
 * The number is stored as a string and then converted to an integer via a recursive function
 * The current number, total, and average of the numbers computed is displayed
 */

import java.util.*;

public class Conversion
{  
   public static void main(String[] args)
   {
	   String n = "ERROR RESPONSE";
	   //initial string for workspace
	   boolean run = true;
	   //final amount
	   int total = 0;
	   //how many times the method is run
	   int ran = 0;
	   // collects average to display
	   int ave = 0;
	   //base multipliers
	   int[] currentBase = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
	   
	   
       System.out.println("\nBegin Recursive String to Integer Demo\n");    
       
       Scanner in = new Scanner(System.in);
       
       while (run == true)
       {
    	   System.out.println("Enter 'q' at any time to quit");
    	   System.out.print("Enter a number up to eight digits long: ");
    	n = in.nextLine();
    	   if (n.length() > 8 || n.length() == 0)
    	   {
    		   //catches number that is too long or no number at all
    		   System.out.println("Your number had more than the allowed or no digits!");
    	   }
    	   else if (n.equals("q"))
    	   {
    		   //terminates program
    		   run = false;
    	   }
    	   //checks to make sure integer was input
    	   else if (n.matches("[a-zA-Z]"))
    	   {
    		   System.out.println("That's not a number!");
    	   }
    	   //handles negative integers
    	   else if (n.charAt(0) == '-')
    	   {
    		   int newNum;
    		   n.replaceAll("-", "0");
        	   newNum = converter(n, currentBase, 1, n.length() - 2);
        	   newNum = newNum - (newNum * 2);
        	   total = newNum + total;
        	   ran++;
        	   ave = total / ran;
        	   System.out.println("Current Number: " + newNum); 
    	   }
    	   //handles positive integers
    	   else if (!n.matches("[a-zA-Z]") && n.charAt(0) != '-')
    	   {
    	   int newNum = converter(n, currentBase, 0, 0);
    	   total = newNum + total;
    	   ran++;
    	   ave = total / ran;
    	   System.out.println("Current Number: " + newNum);
    	   }
  
       }
      System.out.println("Final Average: " + ave);
	   System.out.println("Final Total: " + total);
       System.out.println("\nEnd Recursive Demo\n");
       
   }

   /**
    * Changes string to integer.
    * 
    * Use the length to compute digit to the tens' place
    * add the digits together and run again
    * 
    * @param d = the user's string
    * @param num = base multipliers
    * @param pos = loops current position
    * @param counter = used to get correct index for base
    * @return result + run it again | result
    */
   public static int converter(String d, int[] num, int pos, int counter)
   {  
	   int base;
	   int n;
	   if (counter < 0)
	   {
		   n = 0;
		   return n;
	   }
	   else if (pos == 0)
	   {
	   n = d.charAt(pos) - 48;
	   base = num[d.length() - 1];
	   n *= base;
	   pos++;
	   counter = d.length();
	   counter = counter - 2;
	   return n + converter(d, num, pos, counter);
	   }
	   else
	   {
		   n = d.charAt(pos) - 48;
		   base = num[counter];
		   n *= base;
		   pos++;
		   counter--;
		   return n + converter(d, num, pos, counter);
	   }
	   }  
   }