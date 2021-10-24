package task2;

import java.util.LinkedList;

public class BinaryTree {
	LinkedList<Integer> nodeList = new LinkedList<Integer>();

	public void addNode(Node node) {
		if (node != null) {
			addNode(node.getLeft());
			nodeList.add(node.getData());
			addNode(node.getRight());
		}
	}

	public LinkedList<Integer> getNodeList() {
		return nodeList;
	}

}
