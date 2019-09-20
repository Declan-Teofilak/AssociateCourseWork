import java.util.Arrays;

//<T> place holder for object being passed in
public class ArrayList<T> {
	//creates new Object array
	private Object[] list;
	private int currentSize;
	private int listLength;
	//default constructor
	public ArrayList()
	{
		this.currentSize = 0;
		listLength = 10;
		list = new Object[10]; 
	}
	//constructor with length variable
	public ArrayList(int length)
	{
		this.currentSize = 0;
		listLength = length;
		list = new Object[length];
	}
/**
 * add to the end of the list
 * @param T - object to place in list
 */
public void add(T emp)
{
	if (currentSize == this.listLength)
	{
		Object[] tempArr = new Object[currentSize + 10];
		for (int i = 0; i < currentSize; i++)
		{
			tempArr[i] = list[i];
		}
		list = tempArr;
	}
	list[currentSize] = emp;
	currentSize++;
	
}
/**
 * get index of chosen element
 * @param T - object to place in list
 */
public String get(T emp)
{
	String pos;
	for (int i = 0; i < currentSize; i++)
	{
		if (list[i].equals(emp))
		{
			return pos = "That bird is located at index " + (i + 1);
		}
	}
	return pos = "Sorry, that bird was not found!";
}
/**
 * remove item via index
 * @param choice - index value
 */
public void remove(int choice)
{
	choice = choice - 1;
	for (int i = choice; i < this.currentSize; i++)
	{
		list[choice] = list[choice + 1];
	}
	list[currentSize - 1] = null;
	currentSize--;
}
/**
 * return number of elements in list
 * @return currentSize of specified list
 */
public int size()
{
	return this.currentSize;
}
/**
 * change element via index
 * @param choice - index value
 * @param T - object to place in list
 */
public void set(int choice, T emp)
{
	list[choice - 1] = emp;
}
/**
 * returns true if empty
 * @return check - string stating the status of the list
 */
public String isEmpty()
{
	String check;
	if (currentSize == 0)
	{
		return check = "The cage is empty!";
	}
	else
	{
		return check = "The cage is not empty!";
	}
}
/**
 * generic toString
 */
public void printArray()
{
	for (Object T: list)
	{
		if (T == null)
		{
			break;
		}
		System.out.print(T + " ");
	}
}
}