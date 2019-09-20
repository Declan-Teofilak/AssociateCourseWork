/**
 * custom Queue class using a linked list to store data
 * @author Declan
 */
import java.util.LinkedList;

public class ReleaseOrder<T>
{
	
	private int listLength;
	LinkedList<T> list = new LinkedList<T>();
	
	ReleaseOrder()
	/**
	 * default constructor for queue
	 */
	{
		listLength = 0;
	}
	public boolean isEmpty()
	/**
	 * method to let user know the list is currently empty or has elements
	 * @return result true or false depending on list length variable
	 */
	{
		boolean result;
		if (this.listLength == 0)
		{
			return result = true;
		}
		else
		{
			return result = false;
		}
	}
	public int size()
	/**
	 * size method that acts as a getter for the variable listLength
	 * @return listLength equal to current size of list
	 */
	{
		return this.listLength;
	}
	public void add(T game)
	/**
	 * add method which places a user defined object into the list
	 * @param game object of the videoGame class
	 */
	{
		list.add(game);
		this.listLength++;
	}
	public T peek()
	/**
	 * retrieves but does not remove the head node of the queue
	 * @return result the first object in the list
	 * @return null if list is empty
	 */
	{
		if (listLength != 0)
		{
		T result = list.get(0);
		return result;
		}
		else
		{
			return null;
		}
		
	}
	public T poll()
	/**
	 * retrieves and removes the head node of the queue
	 * @return result the first object in the list
	 * @return null if list is empty
	 */
	{
		if (listLength != 0)
		{
		T result = list.get(0);
		list.remove(0);
		this.listLength--;
		return result;
		}
		else
		{
			return null;
		}
	}
	@Override
	public String toString()
	/**
	 * toString method that is overridden to use the linked list default toString method
	 * @return the contents of the list via the defined videoGame toString
	 */
	{
		return list.toString();
	}
}
