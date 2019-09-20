
public class test extends ArrayList {

	public static void main(String[] args) 
	{
		bird b1 = new bird("Dog", 2, "Pigeon");
		bird b2 = new bird("Jigsaw", 72, "Macaw");
		bird b3 = new bird("Kazooie", 90, "Eclectus");
		bird b4 = new bird("Phobos", 8, "Green Cheek Conure");
		bird b5 = new bird("Big", 26, "Parakeet");
		bird b6 = new bird();
		
		//create new ArrayList
		ArrayList<bird> birdCage = new ArrayList<bird>();
		
		birdCage.add(b1);
		
		System.out.println(b1.toString());
		
		birdCage.printArray();
		
		birdCage.add(b6);
		
		System.out.println();
		
		birdCage.printArray();
		
		System.out.println();
		
		birdCage.size();
		//test isEmpty
		System.out.println(birdCage.isEmpty());
		
		birdCage.add(b5);
		
		birdCage.add(b4);
		
		birdCage.printArray();
		
		System.out.println();
		
		System.out.println(birdCage.size());
		
		birdCage.set(2, b2);
		
		birdCage.printArray();
		
		birdCage.remove(3);
		
		System.out.println();
		
		birdCage.printArray();
		
		System.out.println();
		
		System.out.println(birdCage.size());
		//testing filling the array
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		birdCage.add(b3);
		
		System.out.println();
		
		birdCage.printArray();
		
		System.out.println();
		//overfilled the array and it lengthens
		birdCage.add(b3);
		
		birdCage.printArray();
		
		System.out.println();
		
		System.out.println(birdCage.size());
		
		birdCage.remove(12);
		
		System.out.println();
		
		birdCage.printArray();
		
		System.out.println();
		
		System.out.println(birdCage.size());
		
		System.out.println();
		//gets location of bird on list
		System.out.println(birdCage.get(b2));
		
		System.out.println();
		//gets location of bird no longer on list
		System.out.println(birdCage.get(b6));

		
		
	}

}
