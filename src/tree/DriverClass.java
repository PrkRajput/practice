package tree;

public class DriverClass {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(4);
		tree = tree.addToBST(tree,2);
		tree = tree.addToBST(tree,6);
		tree = tree.addToBST(tree,7);
		tree = tree.addToBST(tree,3);
		tree = tree.addToBST(tree,5);
		tree = tree.addToBST(tree,1);
		
		BinaryTree.printBinaryTree(tree.root, 5);

	}

}
