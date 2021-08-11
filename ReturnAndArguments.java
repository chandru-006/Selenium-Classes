package week1.day2;

public class ReturnAndArguments {

	public int add() {
		int x = 1, y = 10;
		int z = x + y;
		return z;
	}

	public void sub(int a, int b) {
		int c = b - a;
		System.out.println("The Subracted Answer is "+ c);
	}

	public static void main(String[] args) {
		ReturnAndArguments obj=new ReturnAndArguments();
		int m = obj.add();
		System.out.println("Tha Added Answer is " +m);
		obj.sub(obj.add(), 50);
		
	}

}
