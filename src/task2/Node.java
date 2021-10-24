package task2;

public class Node {
	private Node left, right;
	private Integer data;

	public Node(int data) {
		this.data = data;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void addNumber(Integer number) {
		if (number > data) {
			if (right != null) {
				right.addNumber(number);
			} else {
				right = new Node(number);
			}
		} else {
			if (left != null) {
				left.addNumber(number);
			} else {
				left = new Node(number);
			}
		}
	}

	public void printBigger() {
		if (right != null) {
			right.printBigger();
		} else {
			System.out.println("The bigger number is: " + data);
		}
	}
}
