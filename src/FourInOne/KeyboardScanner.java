package FourInOne;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.printf("Enter a integer: ");
		int value = Keyborad.nextInt();
		System.out.printf("Enter a float point number: ");
		float value2 = Keyborad.nextFloat();
		System.out.printf("Enter your name: ");
		String name = Keyborad.next();
		float value3 = value * value2;
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e.", name, value, value2, value3);
		Keyborad.close();
	}

}
