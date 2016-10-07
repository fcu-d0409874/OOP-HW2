package FourInOne;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.printf("Enter a integer: ");
		int value = Keyborad.nextInt();
		if (value % 2 == 0) {
			System.out.printf("The input integer is Even Number.");
		} else {
			System.out.printf("The input integer is Odd Number.");
		}
		Keyborad.close();
	}

}
