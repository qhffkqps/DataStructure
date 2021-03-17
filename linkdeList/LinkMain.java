package linkdeList;


public class LinkMain {

	public static void main(String[] args) {
		
		SList<String> s = new SList<String>();  //���� ����Ʈ ��ü s ����
		s.insertFront("orange");
		s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s�� ���� = "+s.size()+"\n");
		System.out.println("ü���� \t" + s.search("cherry")+"��°�� �ִ�.");
		System.out.println("Ű���� \t" + s.search("kiwi")+"��°�� �ִ�.\n");
		
		s.DeletAfter(s.head);
		s.print();
		System.out.println(": s�� ���� =" + s.size());System.out.println();
		s.DeletFront();
		s.print();
		System.out.println(": s�� ���� =" + s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>(); //���� ����Ʈ ��ü t ����
		t.insertFront(500);
		t.insertFront(200);
		t.insertAfter(400,t.head);
		t.insertFront(100);
		t.insertAfter(300,t.head.getNext());
		t.print();
		System.out.println(": t�� ����"+t.size());
	}

}
