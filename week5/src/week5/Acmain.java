package week5;  //2

public class Acmain {
	public static void main(String[] args) {
		arrrayStack<String> stack = new arrrayStack<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}
}
