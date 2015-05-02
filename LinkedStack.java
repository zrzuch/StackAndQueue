public class LinkedStack<T> implements Cloneable {

	private Node<T> head;
	private int size;

	public LinkedStack() {
		head = null;
		size = 0;
	}

	@SuppressWarnings("unchecked")
	public LinkedStack<T> clone() {
		LinkedStack<T> answer = null;
		try {
			answer = (LinkedStack<T>) super.clone();
		} catch (Exception e) {
			throw new RuntimeException("Implement Cloneable");
		}
		return answer;
	}

	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void push(T element) {
		head = new Node<T>(element, head);
		size++;
	}

	public T pop() {
		T temp = head.getData();
		head = head.getLink();
		size--;
		return temp;
	}

	public T peek() {
		return head.getData();
	}

	public String toString() {
		String s = "[";
		if (!isEmpty()) {
			Node<T> current = head;
			while (current != null) {
				s += current.getData();
				current = current.getLink();
			}
		}
		s += "]";
		return s;
	}
}
