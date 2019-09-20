/**
 * Author: Declan T
 * 
 * Java program that generates a 'shelf' of video games, and allows the user to input, change, find, display, and delete
 * items by name within the program
 * 
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test extends videoGame {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		//default year if user does not input numbers
		final int DEFAULTYEAR = 2000;
		//creates new linked list
		LinkedList<videoGame> s = new LinkedList<videoGame>();
		//places new objects in the list
		s.add(new videoGame(2018, "Dead Cells", "PC"));
		s.add(new videoGame(2017, "Fortnite", "PC"));
		s.add(new videoGame(2011, "Fez", "PC"));
		s.add(new videoGame(2009, "The World Ends With You", "Nintendo DS"));
		s.add(new videoGame(2018, "WWE 2K19", "Multiple"));
		//prints the initial list
		System.out.println(s.toString());
		//takes user input for initial menu
		char choice =(menu());
		//if choice == 'Q' the program ends
		while (choice != 'Q')
		{
			//switch statement of different menu options
			switch (choice)
			{
			//takes input of the game name, console, and year and adds it to the back of the linked list
			case 'A': 
			System.out.println("Game name?: ");
			String name = scan.nextLine();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.println("Game console?: ");
			String con = scan.nextLine();
			con = con.substring(0, 1).toUpperCase() + con.substring(1);
			int year;
			try 
			{
			System.out.println("Game release year?: ");
			year = scan.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("That is not a valid year: default year inserted");
				year = DEFAULTYEAR;
			}

			s.add(new videoGame(year, name, con));
			scan.nextLine();
			break;
			//takes the name of the game and finds its location in the list		
			case 'F': 
			System.out.println("What is the name of the item?: ");
			String nameChoice = scan.nextLine();
			//makes sure the game name that was inputed by user is capitalized
			nameChoice = nameChoice.substring(0, 1).toUpperCase() + nameChoice.substring(1);
			for (videoGame e: s)
			{
				if (e.getName().equals(nameChoice))
				{
					System.out.print(e);
					System.out.println();
					System.out.println("The index of the item is " + (s.indexOf(e) + 1));
				}
			}
			System.out.println("Press Enter to Continue: ");
			scan.nextLine();
			break;
			//takes index of item that user wants to see and displays said item
			case 'D': 
			System.out.println("Index of item you want to display: "); 
			try
			{
			int indexChoice = scan.nextInt();	
			System.out.println(s.get(indexChoice - 1));
			}
			catch (IndexOutOfBoundsException e)
			{
				System.out.println("Sorry, that number is not in the index.");
			}
			scan.nextLine();
			break;
			//takes name of game and allows user to change the name, conosle, and publishing year
			case 'C':
				//used to let user know that the object is in the list
				boolean found = false;
				System.out.println("What is the name of the item you would like to change: ");
				String changeChoice = scan.nextLine();
				//capitalizes first letter to avoid errors
				changeChoice = changeChoice.substring(0, 1).toUpperCase() + changeChoice.substring(1);
				for (videoGame e: s)
				{
					if (e.getName().equals(changeChoice))
					{
						System.out.println("Enter the new name: ");
						String changeName = scan.nextLine();
						changeName = changeName.substring(0, 1).toUpperCase() + changeName.substring(1);
						e.setName(changeName);
						System.out.println("Enter the new console: ");
						e.setConsole(scan.nextLine());
						System.out.println("Enter the new year: ");
						try 
						{
						year = scan.nextInt();
						e.setpubYear(year);
						}
						catch (InputMismatchException a)
						{
							System.out.println("That is not a valid year: default year inserted");
							e.setpubYear(DEFAULTYEAR);
						}

						//tells program the object is in the list
						found = true;
						break;
					}
				}
				//displays message if game was not found
				if (found == false)
				{
					System.out.print("Sorry, that item doesn't exist!");
				}
				else
				{
				scan.nextLine();
				break;
				}
				//removes game from the list via the name of the game
			case 'R': 
				System.out.println("What is the name of the item you would like to remove: ");
				String removeChoice = scan.nextLine();
				//capitalizes first letter of the name
				removeChoice = removeChoice.substring(0, 1).toUpperCase() + removeChoice.substring(1);
				for (videoGame e: s)
				{
					if (e.getName().equals(removeChoice))
					{
						int remove = s.indexOf(e);
						s.remove(remove);
						break;
					}
				}
				System.out.println("Press Enter to Continue: ");
				scan.nextLine();
				break;
			//sorts the linked list via the publishing year
			case 'S': 
				Collections.sort(s);
				break;
			//ends the program
			case 'Q': 
				scan.nextLine();
				break;
			}
			//prints updated list after every actions
			System.out.println(s.toString());
			System.out.println();
			//repeats menu prompt
			choice =(menu());
			}
		//ends program if 'Q' is input with the final list and 
		//ending message of "-- END --"
		System.out.println(" -- END -- ");
		System.out.println(s.toString());
	}
	public static char menu()
	/**
	 * displays an interactive menu for the user that takes their
	 * input and prompts the program on which choice was made
	 * @return char which signifies the user's desired action within switch statement
	 */
	{
		Scanner scan = new Scanner(System.in);
		String menu = 
				"\nSelect Activity below:\n" +
				"\t[A]dd\n" +
				"\t[F]ind\n" +
				"\t[D]isplay\n" +
				"\t[C]hange\n" +
				"\t[R]emove\n" +
				"\t[S]ort\n" +
				"\t[Q]uit\n" +
				"Enter the letter in the \"[ ]\": ";
		System.out.print(menu);
		return scan.next().toUpperCase().charAt(0);
	}
}