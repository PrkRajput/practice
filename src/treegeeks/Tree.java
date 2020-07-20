package treegeeks;

public class Tree {
	// return true if the given tree is a BST, else return false
	boolean isBST(Node root) {
		return util(root, -1, 100001);
	}

	boolean util(Node root, int min, int max) {

		if (root == null)
			return true;

		if (root.left != null)
			if (root.left.data >= root.data || root.left.data > max || root.left.data < min)
				return false;

		if (root.right != null)
			if (root.right.data < root.data || root.right.data < min || root.right.data > max)
				return false;

		return (util(root.left, min, root.data) && util(root.right, root.data, max));

	}
}