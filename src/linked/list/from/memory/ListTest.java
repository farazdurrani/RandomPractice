package linked.list.from.memory;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new List<>();
		list.insertAtFront(5);
		list.insertAtFront(7);
		list.insertAtFront(9);
		list.print();
		list.removeFromFront();
		list.print();
		list.removeFromFront();
		list.print();
		list.removeFromFront();
		list.print();
		list.insertAtFront(11);
		list.print();
		list.insertAtFront(13);
		list.print();
		// 13 11 15 17 19
		list.insertAtBack(15);
		list.insertAtBack(17);
		list.insertAtBack(19);
		list.print();
		// 13 11 15 17 19
		list.removeFromBack();
		list.print();
		// 13 11 15 17
		list.removeFromBack();
		list.print();
		// 13 11 15
		list.removeFromBack();
		list.print();
		// 13 11
		list.removeFromBack();
		list.print();
		// 13
		list.removeFromBack();
		list.print();

	}

}
