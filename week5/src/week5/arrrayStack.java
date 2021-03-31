package week5;  //2

import java.util.EmptyStackException;

public class arrrayStack <E> {
	private E s[];     // 배열
	private int top;    // 스택의 top 항목 원소인덱스
	public arrrayStack() {     // 스택 생성자
		s = (E[]) new Object [1];  //초기에 크기가 1인 배열 생성
		top = -1;
	}		
	public int size() {
		return top+1;                 // 스택에 있는 항목의 수를 리턴
	}
	public boolean isEmpty() {
		{	return (top == -1);			//스택이 empty라면 true 리턴
			
		}
	}
	public E peek() {
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	public void push (E newItem) {
		if (size() == s.length)
			resize(2*s.length);     //스택을 2배로 확장
		s[++top] = newItem;		// 새 항목을 push
	}
	private void resize(int newSize) {   //배열 크기 조절
		// TODO Auto-generated method stub   
		Object[] t = new Object[newSize];      // newsize 크기의 새로운 배열 t 생성
		for(int i = 0; i < size(); i++)   
			t[i] = s[i];                 //배열 s를 배열 t로 복사
		s= (E[]) t; 					// 배열 t를 배열 s로 
	}
	public void print() {  //  스택의 항목들을 아래에서 위로 출력
		if (isEmpty()) System.out.print("스택이 비어있음");
		else
			for(int i=0; i < size(); i++)
				System.out.print(s[i]+"\t ");
		System.out.println();
	}
	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;    // null로 초기화
		if (size() > 0 && size()==s.length/4)
			resize(s.length/2);    // 스택을 1/2 크기로 축소
		return item;
	}
}


