/**
 * test class for Stack
 * creates three objects, adds them periodically to the stack
 * and then checks the status of the stack
 * @author Declan
 *
 */
public class test extends dogs
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates three new objects
		dogs d1 = new dogs();
		dogs d2 = new dogs("Poodle", 2, 11);
		dogs d3 = new dogs("Chow Chow", 25, 6);
		//Creates stack
		System.out.println("Create the stack:");
		Stack<dogs> kennel = new Stack<dogs>();
		//add first object
		kennel.push(d1);
		//print stack
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		//check size
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		//check if empty
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//remove first object
		kennel.pop();
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//add two more objects
		kennel.push(d1);
		kennel.push(d2);
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//remove last inserted object
		kennel.pop();
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//add two more objects
		kennel.push(d2);
		kennel.push(d3);
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//remove last inserted object
		kennel.pop();
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//remove all objects
		kennel.pop();
		kennel.pop();
		//print, check size and if stack is empty
		System.out.println("Print the stack:");
		kennel.toScreen();
		System.out.println();
		System.out.println("Check stack size:");
		System.out.println(kennel.size());
		System.out.println("Is the stack empty?:");
		System.out.println(kennel.isEmpty());
		//attempt to remove when stack is empty
		System.out.println("Try to remove object when stack is empty:");
		kennel.pop();
	}

}
