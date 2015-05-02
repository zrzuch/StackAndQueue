public class Node<T> {
	
	private T data;
	private Node<T> link;
	
	public Node (T initialData, Node<T> initialLink){
		data = initialData;
		link = initialLink;
	}
	
	public T getData () {
		return data;
	}
	
	public Node<T> getLink(){
		return link;
	}
	
	public void setLink(Node<T> newLink){
		link = newLink;
	}
	
	public void addNodeAfter(T element){
		link = new Node<T>(element, link);
	}
	
	public void removeNodeAfter(){
		link = link.link;
	}

}
