package week5; //4

import java.util.EmptyStackException;

public class ListStack <E> {
	private Nodes <E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
public int size() {return size;}
public boolean isEmpty() {return size == 0;}
public void push(E newItem) {
	Nodes newNode = new Nodes(newItem, top);
	top = newNode;
	size++;
}
public E peek() {
	if (isEmpty()) throw new EmptyStackException();
	return top.getItem();
}

public E pop() {
	if (isEmpty()) throw new EmptyStackException();
	E topitem = top.getItem();
	top = top.getNext();    // null�� �ʱ�ȭ
	size--;
	return topitem;
}

public void print() {  //  ������ �׸���� �Ʒ����� ���� ���
	if (isEmpty()) System.out.print("������ �������");
	else
		for(Nodes p = top; p != null; p = p.getNext())
			System.out.print(p.getItem()+"\t ");
	System.out.println();
}
}
