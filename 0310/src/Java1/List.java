package Java1;
import java.util.NoSuchElementException;

public class List <A> {
	
	private A a[];
	private int size;
	
	public List() {
		a = (A[]) new Object[1];
		size = 0;
	}
	public boolean isEmpty() {return size == 0;}
	
	
	
	public void insert(A newitem,int k) {
		if(size ==a.length)
			resize(2*a.length);
		a[k] =newitem;
		size++;
	}
	
	public  A delete(int k) {
		if (isEmpty()) throw new NoSuchElementException();
		A item = a[k];
		for(int i= k;i<size;i++) a[i]=a[i+1]; 
			size--;
			if(size >0 && size == a.length /4);
			resize(a.length/2); 		
		
		return item;
	}
	public A peek(int k) {
		if (isEmpty()) throw new NoSuchElementException();
		return a[k];
	}
	
	private void resize(int newsize) {
		Object[] B = new Object[newsize];
		for(int i = 0;i<size;i++)
			B[i] = a[i];
		a = (A[]) B;
	}
		public void print() {
			if(isEmpty())
				System.out.println("배열이 비어있음");
			else
				for(int i=0;i < a.length;i++) System.out.print(a[i]+"\t ");
			System.out.println();
		
	
		
		
	}

}
