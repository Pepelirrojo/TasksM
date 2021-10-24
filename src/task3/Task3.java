package task3;

import java.math.BigInteger;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number1String = sc.next();
		BigInteger number1Int = new BigInteger(number1String);
		String number2String = sc.next();
		BigInteger number2Int = new BigInteger(number2String);
		String result = number1Int.multiply(number2Int) + "";
		System.out.println(result);
	}
}
