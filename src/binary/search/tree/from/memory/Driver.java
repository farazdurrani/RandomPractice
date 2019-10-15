package binary.search.tree.from.memory;


public class Driver {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		tree.insert(19);
		tree.insert(5);
		tree.insert(6);
		tree.insert(27);
		tree.insert(1);
		tree.insert(22);
		tree.insert(34);
		tree.insert(3);
		tree.insert(5);
		tree.insert(88);
		tree.inOrderTraversal();
	}
}
