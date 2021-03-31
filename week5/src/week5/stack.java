package week5;    // 1

interface stack {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
	
}



	class ArrayStack implements stack{
		 private int top;
		 private int stackSize;
		 private char itemArray[];
		
		 public ArrayStack(int stackSize){
		 top = -1;
		 this.stackSize = stackSize;
		 itemArray = new char[this.stackSize];
		 }

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return (top == -1);
		}

		@Override
		public void push(char item) {
			// TODO Auto-generated method stub
			if(isFull()) {
				System.out.println("Inserting fail! Array Stack is full!!");
			}
			else{
				 itemArray[++top] = item;
				 System.out.println("Inserted Item : " + item);
				 }

		}

		private boolean isFull() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public char pop() {
			// TODO Auto-generated method stub
			if(isEmpty()) {
				 System.out.println("Deleting fail! Array Stack is empty!!");
				 return 0;
				 }
				 else{
				 return itemArray[top--];
				 }
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			if(isEmpty()){
				 System.out.println("Deleting fail! Array Stack is empty!!");
				 }
				 else {
				 top--;
				 }
		}

		@Override
		public char peek() {
			// TODO Auto-generated method stub
			if(isEmpty()){
				 System.out.println("Peeking fail! Array Stack is empty!!");
				 return 0;
				 }
				 else
				 return itemArray[top];

		}
		public void printStack(){
			 if(isEmpty())
			 System.out.printf("Array Stack is empty!! %n %n");
			 else{
			 System.out.printf("Array Stack>> ");
			 for(int i=0; i<=top; i++)
			System.out.printf("%c ", itemArray[i]);
			 System.out.println(); System.out.println();
			 }
		}
		class Array_Stack{
			 public void main(String args[]){
			 int stackSize = 5;
			 char deletedItem;
			 ArrayStack S = new ArrayStack(stackSize);
			
			 S.push('A');
			 S.printStack( );
			
			 S.push('B');
			 S.printStack();
			
			 S.push('C');
			 S.printStack( ); 
			 
			 deletedItem = S.pop();
			 if(deletedItem != 0)
				  System.out.println("deleted Item : " + deletedItem);
			 S.printStack();
			 }
		}
		public void push(String string) {
			// TODO Auto-generated method stub
			
		}

}