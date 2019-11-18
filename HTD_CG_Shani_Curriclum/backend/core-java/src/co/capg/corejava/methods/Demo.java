package co.capg.corejava.methods;

public class Demo {
	static Methods me = new Methods();

	public static void main(String[] args) {
		Methods me1 = new Methods();
		System.out.println(me);
		System.out.println(me1);
		System.out.println(Methods.areaofsquare(6));
		int r=me.y;
		System.out.println(r);
	}
}