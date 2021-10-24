package task2;



public class Task2 {
	

	public static void main(String[] args) {
		Node nodeRoot = new Node(81);
		nodeRoot.addNumber(4);
		nodeRoot.addNumber(21);
		nodeRoot.addNumber(53);
		nodeRoot.printBigger();
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.addNode(nodeRoot);
		System.out.println(binaryTree.getNodeList());
	}

	
}
