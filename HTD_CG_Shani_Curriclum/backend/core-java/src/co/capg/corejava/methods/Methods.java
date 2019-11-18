package co.capg.corejava.methods;

public class Methods {
	int y =23;
	public static void main(String[]args) {
		print();
		int i= areaofsquare(5);
		System.out.println("areaofsquare =" +i );
		//int area= new Methods(). areaofrect(2,5);
		System.out.println(new Methods(). areaofrect(2,5));
	}
	public static void print()
	{
		System.out.println("print()methods");
	}
	public static int areaofsquare(int side) {
		return side*side;
	}
	public int areaofrect(int length,int width)
	{
		return length*width;
	}

}
