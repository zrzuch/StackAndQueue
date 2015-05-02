public class LinkedQueue<T> implements Cloneable {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public LinkedQueue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public LinkedQueue<T> clone() {
		LinkedQueue<T> answer = null;
		try {
			answer = (LinkedQueue<T>) super.clone();
		} catch (Exception e) {
			throw new RuntimeException("Implement Cloneable");
		}
		return answer;
	}
	
	public T dequeue() {
		T temp = head.getData();
		head = head.getLink();
		size--;
		return temp;
	}
	
	public void enqueue(T element) {
		if (size == 0) {
			head = new Node<T>(element, null);
			tail = head;
		} else {
			tail.addNodeAfter(element);
			tail = tail.getLink();
		}
		size++;
	}
	
	public T peek() {
		return head.getData();
	}
	
	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
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
