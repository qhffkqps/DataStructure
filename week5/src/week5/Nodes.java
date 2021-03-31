package week5;  //4

public class Nodes <E> {
private E item;
private Nodes<E> next;
public Nodes(E newItem,Nodes<E> node) {
	item = newItem;
	next = node;
}
public E getItem() {
	return item;
}
public void setItem(E newItem) {
	item = newItem;
}
public Nodes<E> getNext() {
	return next;
}
public void setNext(Nodes<E> newNext) {
	next = newNext;
}


}
