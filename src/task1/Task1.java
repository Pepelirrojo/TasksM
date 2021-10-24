package task1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers you wish to order:");
		int numsArray[] = new int[sc.nextInt()];
		for (int i = 0; i < numsArray.length; i++) {
			System.out.println("Please enter a number:");
			numsArray[i] = sc.nextInt();
		}
		order(numsArray);
		for (int i = 0; i < numsArray.length; i++) {
			System.out.print(numsArray[i]);
			if (i + 1 != numsArray.length) {
				System.out.print(", ");
			}
		}
	}

	public static void order(int[] numsArray) {
		int numBig;
		for (int i = 0; i < numsArray.length - 1; i++) {
			for (int j = 0; j < numsArray.length - i - 1; j++) {
				if (Math.sqrt(numsArray[j + 1]) > Math.sqrt(numsArray[j])) {
					numBig = numsArray[j + 1];
					numsArray[j + 1] = numsArray[j];
					numsArray[j] = numBig;
				}
			}
		}
	}
}
