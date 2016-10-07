package FourInOne;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.printf("Enter a string 1: ");
		String str1 = Keyborad.next();
		System.out.printf("Enter a string 2: ");
		String str2 = Keyborad.next();
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.printf("The two strings are the same.");
		} else {
			System.out.printf("The two strings are not the same.");
		}

		Keyborad.close();
	}

}
