package week5;  //3

public class linked_Stack {

	public static void main(String args[]){
		 char deletedItem;
		 LinkedStack LS = new LinkedStack();
		
		 LS.push('A');
		 LS.printStack();
		
		 LS.push('B');
		 LS.printStack();
		
		 LS.push('C');
		 LS.printStack();
		
		 deletedItem = LS.pop();
		 if(deletedItem != 0)
		 System.out.println("deleted Item : " + deletedItem);
		 LS.printStack();
	} 

}
