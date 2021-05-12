package brackeTest;

public class LinkedStack implements Stack {
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if (isEmpty()) {
			System.out.println("Deleting fail! linked Stack is empty");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
		public void delete() {
			if  (isEmpty()) {
				System.out.println("Delteing fail! Linked stack is empty");
			}else {
				top = top.link;
			}
		}
		public char peek() {
			if (isEmpty()) {
				System.out.println("Peeking fail! Linked stack is empty");
				return 0;
			} else
				return top.data;
		}
		public void printStack() {
			if (isEmpty()) {
				System.out.println("Linked stack is empty %n%n");
			} else {
				StackNode temp = top;
				System.out.println("Linked Stack>>");
				while (temp != null) {
					System.out.printf("\t $c \n", temp.data);
					temp = temp.link;
				}
				System.out.println();
			}
		}
	}

