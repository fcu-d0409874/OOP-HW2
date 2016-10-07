package FourInOne;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.printf("Enter a integer : ");
		int value = Keyborad.nextInt();
		String[] number = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		if (value < 10 && value > 0) {
			System.out.printf("The input integer is \"" + number[value - 1] + "\"");

		} else {
			System.out.printf("The input integer is \"Other\"");
		}
		Keyborad.close();
	}
}
