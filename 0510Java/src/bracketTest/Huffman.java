package bracketTest;

public class Huffman {
	private HuffManEntry[] a;
	private int N;
	
	public Huffman(HuffManEntry[] harray,int initialSize) {
		a = harray;
		N = initialSize;
	}
	
	public int size() {
		return N;
	}
	
	public void createHeap() {
		for(int i = N/2; i > 0; i--) {
			downheap(i);
		}
	}
	public HuffManEntry createTree() {
		while (size() > 1){
			HuffManEntry e1 = deleteMin();
			HuffManEntry e2 = deleteMin();
			HuffManEntry temp = new HuffanEntry(e1.getKey()+e2.getKey(),e1.getValue()+e2.getValue(),e1,e2,"");
			insert(temp);
		}
		return deleteMin();
	}
}
