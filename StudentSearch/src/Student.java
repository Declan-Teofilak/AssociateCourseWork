/**
 * Student class that allows for the creation
 * of a student with a name, id, and major
 * used in conjunction with the BinarySearchTree class
 * and main
 * 
 * @author Declan
 *
 */
public class Student implements Comparable<Student>
{
	private String sName;
	private int sId = 0;
	private String sMajor;

/**
 * default constructor
 */
public Student()
{
	this.sName = null;
	this.sId = 0;
	this.sMajor = null;
}
/**
 * Constructor with custom params for all
 * variables
 * @param n name
 * @param id student ID
 * @param m major
 */
public Student(String n, int id, String m)
{
	this.sName = n;
	this.sId = id;
	this.sMajor = m;
}
/**
 * Special constructor for use
 * in the 'find()' method found in the BST
 * 
 * @param i student ID
 */
public Student(int i)
{
	
	this.sId = i;
}
/**
 * basic getter for student name
 * @return student name
 */
public String getName()
{
	return this.sName;
}
/**
 * basic getter for student major
 * @return student major
 */
public String getMajor()
{
	return this.sMajor;
}
/**
 * basic getter for student ID
 * @return student ID
 */
public int getId()
{
	return this.sId;
}
/**
 * basic setter for student name
 * checks to see if name input is null or blank
 * 
 * @param n student name
 */
public void setName(String n)
{
	if (n == null || n == "")
	{
		System.out.println("Sorry, the studen name can't be blank");
	}
	else
	{
	this.sName = n;
	}
}
/**
 * basic setter for student major
 * verifies the length before setting
 * sets major to DPR if criteria not met
 * 
 * @param m major
 */
public void setMajor(String m)
{
	int test = m.length();
	if (test == 3)
	{
		this.sMajor = m;
	}
	else
	{
		System.out.println("Sorry, majors must be 3 characters: default major inserted");
		this.sMajor = "DPR";
	}
}
/**
 * basic setter for student id
 * verifies the input is positive before setting
 * 
 * @param id student ID
 */
public void setId(int id)
{
	if (this.sId == 0)
	{
		if (id > 0)
		{
			this.sId = id;
		}
		else
		{
			System.out.println("Sorry, the ID must be greater than 0.");
			this.sId = 1;
		}
	}
	else
	{
		System.out.println("This ID can not be changed,");
	}
}
/**
 * Allows for Comparable interface
 * @author Declan
 *
 */
public interface Comparable
{
 int compareTo(Student student1);
}
/**
 * Overrides compareTo method to allow for comparison
 * of student IDs for sorting
 * 
 * @param student1 Student object to be compared
 * @return 1 if greater
 * @return 0 if equal
 * @return -1 if less
 */
@Override
public int compareTo(Student student1) {
	Student student2 = (Student) student1;
	if(sId > student2.getId())
	{
		return 1;
	}
	else if (sId == student2.getId())
	{
		return 0;
	}
	else
	{
		return -1;
	}
}
/**
 * Overrides toString method to create a clean printout of
 * the data held in the Student objects
 * 
 * @return concatenated name, id, and major of student
 */
@Override
public String toString()
{
	return sName + " | " + sId + " | " + sMajor + "\n";
}
}
