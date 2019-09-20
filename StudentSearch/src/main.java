/**
 * Main method for Binary Search Tree program
 * Contains the 'menu()' method for asking for and allowing input
 * from user to navigate BST
 * 
 * @author Declan
 * 
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		System.out.println(" -- Begin Binary Search Tree -- ");
		BinarySearchTree list = new BinarySearchTree();
		//add five students
		Student s1 = new Student("Cindy", 2000, "GEN");
		Student s2 = new Student("Declan", 1994, "DPR");
		Student s3 = new Student("Emily", 1995, "BUS");
		Student s4 = new Student("Vivian", 1992, "GEN");
		Student s5 = new Student("Isabel", 1999, "THR");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		while (run != false)
		{
			char choice = menu();
			switch (choice)
			{
			//add to tree
			case 'A':
				Student c = new Student();
				System.out.println("Please enter a name:");
				String name;
				try
				{
				name = scan.nextLine();
				}
				catch (Exception e)
				{
					System.out.println("Error: Name set to defualt");
					name = "default";
				}
				if (name.contains("[a-zA-z]+"))
				{
				c.setName(name);
				}
				else
				{
					System.out.println("Sorry, name must be alphabetical.");
					c.setName("Default");
				}
				System.out.println("Please enter a three character major (Three characters only):");
				String major = scan.nextLine();
				if (major.contains("[a-zA-z]+"))
				{
				try
				{
				major = major.substring(0, 3).toUpperCase();
				}
				catch (StringIndexOutOfBoundsException e)
				{
					System.out.println("Not an appropriate major: default inserted");
					major = "DPR";
				}
				}
				else
				{
					System.out.println("Not an appropriate major: default inserted");
					major = "DPR";
				}
				c.setMajor(major);
				int id;
				try 
				{
					System.out.println("Please enter an ID:");
					id = scan.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("Student ID must be numerical");
					id = 1;
				}
				
				c.setId(id);
				list.add(c);
				System.out.println("Press enter to continue: ");
				scan.nextLine();
				break;
				//find by id
			case 'F':
				System.out.println("Please enter the student ID:");
				int idFind;
				try
				{
				idFind = scan.nextInt();
				Student test = new Student(idFind);
				if (list.find(test) == null)
				{
					System.out.println("Student not present in list.");
				}
				else
				{
				System.out.println(list.find(test));
				}
				}
				catch (InputMismatchException e)
				{
					System.out.println("ID must be numerical");
				}
				System.out.println("Press enter to continue: ");
				scan.nextLine();
				break;
				//display full BST
			case 'D':
				list.print();
				break;
				//remove by id
			case 'R':
				boolean deleted = false;
				System.out.println("Enter the ID of the student you want to remove: ");
				int removeChoice;
				try
				{
				removeChoice = scan.nextInt();
				ArrayList<Object> removeList = list.getList();
				if (removeList.isEmpty() == true)
				{
					System.out.println("The list is empty.");
				}
				else
				{
				for (Object s: removeList)
				{
					//cast Object s as Student
					if (((Student) s).getId() == removeChoice)
					{
						list.remove((Comparable) s);
						deleted = true;
						break;
					}
				}
				if (deleted != true)
				{
					System.out.println("ID not found, student not removed.");
				}
				}
				}
				catch (InputMismatchException e)
				{
					System.out.println("ID must be numerical");
				}
				System.out.println("Press enter to continue: ");
				scan.nextLine();
				break;
				//Sort by major
			case 'S':
				boolean found = false;
				System.out.println("What major would you like to see (Three characters allowed)?: ");
				String majorChoice = new String(scan.nextLine());
				try
				{
				majorChoice = majorChoice.substring(0, 3).toUpperCase();
				ArrayList<Object> sortList = list.getList();
				for (Object s: sortList)
				{
					String dog = new String();
					if (((Student) s).getMajor() == null)
					{
						break;
					}
					else
					{
					dog = new String(((Student) s).getMajor());
					if (dog.equals(majorChoice))
							{
						System.out.println(s.toString());
						found = true;
							}
					}
				}
				if (found == false)
				{
					System.out.println("Major not found within list.");
				}
				}
				catch (StringIndexOutOfBoundsException e)
				{
					System.out.println("Major must be three characters long.");
				}
				System.out.println("Press enter to continue: ");
				scan.nextLine();
				break;
			case 'Q': run = false;
			list.print();
			System.out.println(" -- END -- ");
				break;
				
			}
			
		}
	}
	/**
	 * displays an interactive menu for the user that takes their
	 * input and prompts the program on which choice was made
	 * @return char which signifies the user's desired action within switch statement
	 */
	public static char menu()
	{
		Scanner scan = new Scanner(System.in);
		String menu = 
				"\nSelect Activity below:\n" +
				"\t[A]dd\n" +
				"\t[F]ind\n" +
				"\t[D]isplay\n" +
				"\t[R]emove\n" +
				"\t[S]ort by Major\n" +
				"\t[Q]uit\n" +
				"Enter the letter in the \"[ ]\": ";
		System.out.print(menu);
		return scan.next().toUpperCase().charAt(0);
	}
}

