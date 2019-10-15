package binary.search.tree.from.memory;

public class Tree<E extends Comparable<E>> {
	private TreeNode<E> root;
	public Tree() {
		root = null;
	}
	
	public void insert(E insertData) {
		if(root == null) {
			root = new TreeNode<E>(insertData);
		} else {
			root.insert(insertData);
		}
	}
	
	public void preOrderTraversal() {
		preOrderTraversalHelper(root);
	}

	private void preOrderTraversalHelper(TreeNode<E> node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		preOrderTraversalHelper(node.left);
		preOrderTraversalHelper(node.right);
	}
	
	public void inOrderTraversal() {
		inOrderTraversalHelper(root);
	}
	
	public void inOrderTraversalHelper(TreeNode<E> node) {
		if(node == null) {
			return;
		}
		inOrderTraversalHelper(node.left);
		System.err.println(node.data);
		inOrderTraversalHelper(node.right);
		
	}
	
	public void postOrderTraversal() {
		postOrderTraversalHelper(root);
	}

	private void postOrderTraversalHelper(TreeNode<E> node) {
		if(node == null) {
			return;
		}
		postOrderTraversalHelper(node.left);
		postOrderTraversalHelper(node.right);
		System.out.println(node.data);
	}
	
}

