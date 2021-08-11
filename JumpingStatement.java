package week1.day2;

public class JumpingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 55; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 8; i++) {
			if (i == 3) {
				return;
			}
			System.out.println(i);
		}
		//this will not execute because the return ends the method
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}


}