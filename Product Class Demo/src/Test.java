
public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Item One", 111);
		Product p2 = new Product("Item Two", 222);
		Product p3 = new Product("Item Three", 333);
		Product p4 = new Product("Item Four", 444);
		Product p5 = new Product("Item Five", 555);

		
		System.out.println("- Product Demo Begins -");
		
		System.out.println("---Test Setters and Getters---");
		System.out.println();
		//
		p1.setCost(4.00);
		System.out.println(p1.getCost());
		p2.setName("Second Product");
		System.out.println(p2.getName());
		p3.setNum(3);
		System.out.println(p3.getNum());
		//
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		//
		System.out.println();
		System.out.println("---Test Shipping Method With no Inventory---");
		System.out.println();
		p1.ship(20);
		//
		System.out.println();
		System.out.println("---Test Reciept---");
		System.out.println();
		p1.rec(5, 4.00);
		System.out.println(p1.toString());
		p5.rec(6, 3.00);
		System.out.println(p5.toString());
		//
		System.out.println();
		System.out.println("---Test Shipping Method With Inventory---");
		System.out.println();
		p1.ship(3);
		System.out.println(p1.toString());
		//
		System.out.println();
		System.out.println("---Test Changing Name and Cost With Inventory---");
		System.out.println();
		p1.setCost(8.00);
		p1.setNum(22);
		//
	}

}
