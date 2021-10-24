package task4;

import java.util.Scanner;

public class Task4VsGame {
	static int lastPositionY = 0;
	static int lastPositionX = 0;
	static int[][] map = new int[64][64];
	static boolean isEnd = false;

	public static void main(String[] args) {
		fillMap();
		printMap();
		Scanner sc = new Scanner(System.in);
		while (!isEnd) {
			System.out.println("Where do you want to go?\n4. Left\n6. Right\n8. Up\n2. Down");
			int choice = sc.nextInt();
			System.out.println("How many movements?");
			int numMov = sc.nextInt();
			try {
				switch (choice) {
				case 4: {
					left(numMov);
					break;
				}
				case 6: {
					right(numMov);
					break;
				}
				case 8: {
					up(numMov);
					break;
				}
				case 2: {
					down(numMov);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				checkEnd();
				printMap();
			} catch (Exception e) {
				System.out.println("OUT OF RANGE");
			}
		}
		System.out.println("FINISH");
	}

	private static void checkEnd() {
		if (lastPositionX == 64 && lastPositionY == 64) {
			isEnd = true;
		}
	}

	private static void right(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY][lastPositionX + i] = 0;
		}
		moves -= 1;
		lastPositionX += moves;
	}

	private static void left(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY][lastPositionX - i] = 0;
		}
		moves -= 1;
		lastPositionX -= moves;
	}

	public static void down(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY + i][lastPositionX] = 0;
		}
		moves -= 1;
		lastPositionY += moves;
	}

	public static void up(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY - i][lastPositionX] = 0;
		}
		moves -= 1;
		lastPositionY -= moves;
	}

	private static void fillMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = 1;
			}
		}
	}

	private static void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.print(map[i][j] + "  ");
				if (map[i][j] == 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
