package linked.list.from.memory;

import java.util.NoSuchElementException;

public class List<E> {
	
	private ListNode<E> first;

	private ListNode<E> last;

	private String name;

	public List() {
		this("LinkedList");
	}

	public List(String name) {
		this.name = name;
		first = last = null;
	}

	void insertAtFront(E data) {
		if (isEmpty()) {
			first = last = new ListNode<E>(data);
		}
		else {
			ListNode<E> newNode = new ListNode<>(data);
			newNode.next = first;
			first = newNode;
		}
	}
	
	E removeFromFront() {
		if (isEmpty()) {
			throw new NoSuchElementException(name + " is Empty");
		}
		E data = first.data;
		if (first == last) {
			first = last = null;
		}
		else {
			first = first.next;
		}
		return data;
	}

	void insertAtBack(E data) {
		if (isEmpty()) {
			first = last = new ListNode<E>(data);
		}
		else {
			ListNode<E> newNode = new ListNode<>(data);
			last.next = newNode;
			last = newNode;
		}
	}

	E removeFromBack() {
		if (isEmpty()) {
			throw new NoSuchElementException(name + " is empty");
		}

		E data = last.data;

		if (first == last) {
			first = last = null;
		}
		else {
			ListNode<E> current = first; // lets start with first
			while (current.next != last) {
				current = current.next;
			}
			last = current;
			last.next = null;
		}
		return data;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void print() {
		ListNode<E> current = first;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}


}
