package binary.search.tree.from.memory;

class TreeNode<E extends Comparable<E>> {
	TreeNode<E> left;

	E data;

	TreeNode<E> right;

	TreeNode(E data) {
		this.data = data;
		left = right = null;
	}

	public void insert(E insertData) {
		if (insertData.compareTo(data) < 0) {
			if (left == null) {
				left = new TreeNode<E>(insertData);
			}
			else {
				left.insert(insertData);
			}
		}
		else if (insertData.compareTo(data) > 0) {
			if (right == null) {
				right = new TreeNode<E>(insertData);
			}
			else {
				right.insert(insertData);
			}
		}
	}

}
