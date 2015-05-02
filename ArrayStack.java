public class ArrayStack<T> implements Cloneable{
	
	private T[] data;
	private int size;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		data = (T[]) new Object[10];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		data = (T[]) new Object[size];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public void ensureCapacity(int size) {
		T[] temp = (T[]) new Object[size];
		System.arraycopy(data, 0, temp, 0, temp.length);
		data = temp;
	}
	
	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public T itemAt(int index) {
		return data[(size - index) - 1];
	}
	
	public T peek() {
		return data[size - 1];
	}

	public T pop() {
		size--;
		return data[size];
	}
	
	public void push(T element) {
		if (size == data.length) {
			ensureCapacity((data.length * 2) + 1);
		}
		data[size] = element;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		String s = "[";
		if (!isEmpty()) {
			for (int i = size - 1; i >= 0; i--) {
				s += data[i] + " ";
			}
		}
		s += "]";
		return s;
	}
}