package linkdeList;

import java.util.NoSuchElementException;

public class SList <E> {
	protected Node head;
	private int size;
	
	public SList() {
		head = null;
		size = 0;
	}
	
	public int search(E target) {
		Node p = head;
		for(int k = 0;k < size();k++) {
			if(target == p.getItem())
				return k;
			p = p.getNext();
		}
		return -1;     /// Ž�� ���� ���� �� -1�� ����
	}

	int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head); 
		size++;	
		
	}
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem,p.getNext()));
		size++;
	}
	
	public void DeletFront() {
		if(isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void DeletAfter(Node p) {
		if(p == null) throw new NoSuchElementException();
		Node t = p.getNext();	// ��� t ��  ��� p�� ���� ���
		p.setNext(t.getNext());  //  p ���� ���� 
		t.setNext(null);
		size--;
	}
	public  void print() {
		for(Node p = head;p != null;p = p.getNext())
			System.out.print(p.getItem()+"|t");
		System.out.println();
	}
	
	
}
