/**
 * Test methods and data of the ReleaseOrder and videoGame classes
 * @author Declan
 *
 */
public class test {

	public static void main(String[] args) 
	{
		ReleaseOrder<videoGame> list = new ReleaseOrder<videoGame>();
		videoGame mario1 = new videoGame(1998, "King Of Fighters 98'", "NeoGeo");
		videoGame mario2 = new videoGame(2017, "Super Mario 3D World", "Wii U");
		videoGame mario3 = new videoGame(2018, "Super Mario Odyssey", "Switch");
		
		list.add(mario1);
		list.add(mario2);
		list.add(mario3);
		//initial queue
		System.out.println(list.toString());
		System.out.println(" -- Begin Queue Test -- ");
		System.out.println(" -- Check if list is empty -- ");
		System.out.println(list.isEmpty());
		System.out.println(" -- Print size of list -- ");
		System.out.println(list.size());
		System.out.println(" -- Add new game and print list -- ");
		list.add(new videoGame());
		System.out.println(list.toString());
		System.out.println(" -- Peek first element -- ");
		System.out.println(list.peek());
		System.out.println(" -- Poll first element and print list -- ");
		System.out.println(list.poll());
		System.out.println(list.toString());
		System.out.println(" -- Poll remaning elements and print empty list -- ");
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.toString());
		System.out.println(" -- Check if list is empty -- ");
		System.out.println(list.isEmpty());
		System.out.println(" -- Print size of list -- ");
		System.out.println(list.size());
		System.out.println(" -- Peek first element while list is empty -- ");
		System.out.println(list.peek());
		System.out.println(" -- Poll first element while list is empty-- ");
		System.out.println(list.poll());
		System.out.println(" -- Add new game and print list -- ");
		list.add(new videoGame());
		System.out.println(list.toString());
		System.out.println(" -- End Queue Test -- ");

	}

}
