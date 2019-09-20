import java.text.DecimalFormat;
import java.util.*;

public class Product 
{
	// product number
	private int num;
	//product name
	private String name;
	// product inventory
	private int inventory = 0;
	// product cost
	private double cost = 0.00;
	// total cost
	private double totalCost = 0.00;
	
public Product(String name, int num) // constructor w/parameters
{
	this.name = name;
	this.num = num;
}	
public int getNum() 
{
	return num;
}
public void setNum(int num)
{
	if (this.inventory == 0)
	{
	this.num = num;
	}
	else
	{
		System.out.print("You can not change the number of a product while it has inventory!");
		System.out.println("");
	}
}
public void setName(String name)
{
	this.name = name;
}
public String getName()
{
	return name;
}
public int getInventory()
{
	return inventory;
}
public void setCost(double cost)
{
	Scanner scan = new Scanner(System.in);
	if (this.inventory == 0)
	{
	this.cost = cost;
	}
	else
	{
		System.out.print("You can not change the cost of a product while it has inventory!");
		System.out.println("");
	}
}
public double getCost()
{
	return cost;
}
public void ship(int quantity)
//ships out inventory
//@param quantity is amount shiping out
{
	if (quantity < inventory)
	{
	this.inventory -= quantity;
	}
	else
	{
		System.out.println("You don't have that much inventory!");
		System.out.println("");
	}
}
public void rec(int quantity, double cost)
// keeps track of moving shipments and their affect on inventory
// @param quantity = amount coming in
// @param cost = cost of incoming shipment
{
	double currentCost = inventory * this.cost; // inv times cost
	double receivingCost = quantity * cost; //receiving units times receiving cost
	this.totalCost = currentCost + receivingCost; 
	this.inventory += quantity; // inv units + received units i.e "total units"
	this.cost = totalCost/inventory;
	
}
@Override
public String toString()
{
	DecimalFormat format = new DecimalFormat("#.00");
	
	return String.format(name + " " + num + " " + inventory + " " + format.format(cost) + " " + format.format(totalCost));
}
}