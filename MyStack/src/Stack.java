/**
 * Stack class that allows for use of pop, push, isEmpty
 * size, and toScreen
 * implements the default T object
 * @author Declan
 */
import java.util.ArrayList;

public class Stack<T>
{
	//variable to store length of arrayList
	int listLength;
	//default arrayList
	ArrayList<T> s = new ArrayList<T>();
	/**
	 * constructor for the stack
	 * creating an arrayList that accepts default 
	 * objects and has a length (listLength) of 0
	 */
	Stack()
	{
	ArrayList<T> s = new ArrayList<T>();
	listLength = 0;
	}
	/**
	 * adds the specified item to the top 
	 * (end) of the ArrayList and adds one to
	 * listLength
	 * @param dog - object that is to be added
	 */
	public void push(T dog)
	{
		if (listLength == 0)
		{
		s.add(0, dog);
		}
		else
		{
		s.add(listLength, dog);
		}
		listLength++;
	}
	/**
	 * removes the most recently added item to the stack
	 * if listLength is less than or equal to zero
	 * an error message prints instead.
	 * will subtract one from listLength if successfully
	 * removed
	 */
	public void pop()
	{
		if (listLength <= 0)
		{
			System.out.println("Sorry, your Stack is already empty.");
		}
		else
		{
		s.remove(listLength-1);
		listLength--;
		}
	}
	/**
	 * isEmpty returns true if the stack contains no
	 * elements and false otherwise using listLength
	 * @return true for empty
	 * @return false for not empty
	 */
	public boolean isEmpty()
	{
		boolean result;
		if (listLength == 0)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
		
	}
	/**
	 * returns the size of the stack via listLength
	 * @return listLength
	 */
	public int size()
	{
		return listLength;
	}
	/**
	 * toScreen prints all elements of the stack
	 * to the screen vertically
	 * 
	 */
	public void toScreen()
	{
		if (listLength == 0)
		{
			System.out.println(" | Sorry, there are no elements to print. | ");
		}
		else
		{
		for (Object d: s)
		{
			System.out.println(d.toString());
		}
		}
	}
}

