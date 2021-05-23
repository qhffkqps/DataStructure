package bracketTest;

public class HuffManMain {

	public static void main(String[] args) {
		HuffManEntry[] a;
		a = new HuffManEntry[7];

		a[1] = new HuffManEntry(60,"a",null,null,null);
		a[2] = new HuffManEntry(20,"b",null,null,null);
		a[3] = new HuffManEntry(30,"c",null,null,null);
		a[4] = new HuffManEntry(35,"d",null,null,null);
		a[5] = new HuffManEntry(40,"e",null,null,null);
		a[6] = new HuffManEntry(90,"f",null,null,null);
		
		Huffman h = new Huffman(a,6);
		System.out.println("최소합 만들기 전");
		h.print();
		
		h.createHeap();
		System.out.println("최소힙:");
		h.print();
		
		System.out.println("허프만 코드");
		HuffManEntry root = h.createTree();
		h.preorder(root);
		System.out.println();
	}

}
