package tree;

public class DriverClass {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(20);
		tree = tree.addToBST(tree,11);
		tree = tree.addToBST(tree,8);
		tree = tree.addToBST(tree,21);
		tree = tree.addToBST(tree,27);
		tree = tree.addToBST(tree,4);
		tree = tree.addToBST(tree,5);
		tree = tree.addToBST(tree,7);
		tree = tree.addToBST(tree,30);
		tree = tree.addToBST(tree,1);
		tree = tree.addToBST(tree,17);
		tree = tree.addToBST(tree,18);
		tree = tree.addToBST(tree,-3);
		tree = tree.addToBST(tree,25);
		tree = tree.addToBST(tree,16);
		tree = tree.addToBST(tree,9);
		tree = tree.addToBST(tree,10);
				
		BinaryTree.printBinaryTree2D(tree.root,1);
		/*System.out.println("\n\n PREORDER TRAVERSAL ");
		BinaryTree.printPreorder(tree.root);
		System.out.println("\n\n INORDER TRAVERSAL ");
		BinaryTree.printInorder(tree.root);
		System.out.println("\n\n POSTORDER TRAVERSAL ");
		BinaryTree.printPostorder(tree.root);
		
		int sum = BinaryTree.sumAtK(tree.root, 4, 0);
		System.out.println("\n\n Sum :"+sum );		
		System.out.println("\n\n\n Minimum value ->"+BinaryTree.minimum(tree.root));
		System.out.println("\n\n\n Maximum value ->"+BinaryTree.maximum(tree.root));*/
		tree.root=tree.delNode(tree.root,20);
		System.out.println("\n\n\n\n");
		BinaryTree.printBinaryTree2D(tree.root,1);

	}

}
