package linkdeList;


public class Node <E>{
	private E item;
	private Node<E> next;
	public Node(E newitem, Node<E> node) {
		super();
		item = newitem;
		next = node;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E newitem) {
		item = newitem;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> node) {
		next = node;
	}
	

}
