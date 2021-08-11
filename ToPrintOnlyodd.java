package week1.day2;

import java.util.Iterator;

public class ToPrintOnlyodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				continue;

			}
			System.out.println(i);
		}
	}

}
