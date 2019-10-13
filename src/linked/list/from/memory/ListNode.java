package linked.list.from.memory;

class ListNode<E> {
	
	E data;

	ListNode<E> next;

	public ListNode(E data) {
		this(data, null);
	}

	public ListNode(E data, ListNode<E> node) {
		this.data = data;
		this.next = node;
	}

	public E getData() {
		return this.data;
	}

	public ListNode<E> getNext() {
		return this.next;
	}
}
