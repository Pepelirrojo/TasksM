package task4;

public class Task4 {

	static int lastPositionY = 0;
	static int lastPositionX = 0;
	static int ySize = 32;
	static int xSize = 32;
	static int[][] map = new int[ySize][xSize];

	static int positionY = 0;
	static int positionX = 0;
	static boolean isEnd = false;
	static int exitX = map.length - 1;
	static int exitY = map.length - 1;

	public static void main(String[] args) {
		fillMap();
		if (map.length == 64) {
			loadMap64x64();
		}
		if (map.length == 32) {
			loadMap32x32();
		}

		printMap();
		map[0][0] = 2;
		System.out.println(resolveSquareMaze());
	}

	private static void loadMap32x32() {
		printRight(17);
		printDown(9);
		printRight(12);
		printDown(15);
		printRight(2);
		printDown(5);
		printLeft(7);
		printDown(2);
		printRight(8);
	}

	private static int resolveSquareMaze() {
		int moves = 0;
		while (!isEnd) {
			if (positionX != exitX) {
				if (map[positionY][positionX + 1] == 0) {
					map[positionY][positionX + 1] = 2;
					moves++;
					positionX++;
					System.out.println("Right -> " + moves);
					printMap();
				}
			}
			if (positionX != 0) {
				if (map[positionY][positionX - 1] == 0) {
					map[positionY][positionX - 1] = 2;
					moves++;
					positionX--;
					System.out.println("Left <- " + moves);
					printMap();
				}
			}
			if (positionY != exitY) {
				if (map[positionY + 1][positionX] == 0) {
					map[positionY + 1][positionX] = 2;
					moves++;
					positionY++;
					System.out.println("Down V " + moves);
					printMap();
				}
			}
			if (positionY != 0) {
				if (map[positionY - 1][positionX] == 0) {
					map[positionY - 1][positionX + 1] = 2;
					moves++;
					positionY--;
					System.out.println("Up ^" + moves);
					printMap();
				}
			}

		}

		return moves;
	}

	private static void check() {
		if (positionY == exitY && positionX == exitX) {
			isEnd = true;
		}
	}

	private static void loadMap64x64() {
		printDown(7);
		printRight(8);
		printDown(8);
		printRight(5);
		printDown(12);
		printRight(14);
		printUp(8);
		printRight(7);
		printDown(9);
		printRight(12);
		printLeft(8);
		printDown(8);
		printLeft(9);
		printDown(6);
		printRight(5);
		printUp(4);
		printRight(3);
		printDown(9);
		printRight(7);
		printDown(3);
		printLeft(6);
		printDown(4);
		printRight(9);
		printUp(3);
		printDown(7);
		printRight(3);
		printDown(2);
		printRight(4);
		printUp(1);
		printRight(3);
		printDown(1);
		printRight(5);
		printDown(3);
		printRight(2);
	}

	private static void printRight(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY][lastPositionX + i] = 0;
		}
		lastPositionX += moves;
	}

	private static void printLeft(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY][lastPositionX - i] = 0;
		}
		lastPositionX -= moves;

	}

	public static void printDown(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY + i][lastPositionX] = 0;
		}
		lastPositionY += moves;
	}

	public static void printUp(int moves) {
		for (int i = 0; i < moves; i++) {
			map[lastPositionY - i][lastPositionX] = 0;
		}
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
		check();
	}
}
