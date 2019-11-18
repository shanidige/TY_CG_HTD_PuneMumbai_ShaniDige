package co.capg.corejava.methods;

public class Car {
	String name;
	String color;
	double price;

	public static void main(String[] args) {
	}

	public Car(String name, String color, double price)
	{
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		
	}

	public Car(String name) 
	{
		this.name = name;
	}

	public Car() {
    }

	public Car(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}

	public Car(double price, String name) 
	{
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
