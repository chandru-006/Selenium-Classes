package week1.day2;

public class MyMobile {
	int price=100;
	boolean quickcharging;

	public void makeCall() {
		System.out.println("makecall");
	}

	public void sendMsg() {
		System.out.println("sendMsg");
	}

	private void payBills() {
System.out.println("payBills");
	}

	public static void main(String[] args) {
MyMobile brand=new MyMobile();
	}
}
