

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); //Integer == Generic
		int arr[] = new int[4];
		char charArr[] = new char[4];
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		charArr[3] = 'd';
		
		for(int i=0; i<4; i++) {
			stack.add(i);
		}
		System.out.println("1. add: "+ stack);
		
		for(int i=0; i<4; i++) {
			int a = stack.pop();
			System.out.println("2. pop(): "+a);
		}
		
		for(int i=0; i<4; i++) {
			stack.push(i+1);
		}
		
		System.out.println("3. push: "+stack);
		
		stack.pop();
		
		System.out.println("4. 1번 pop()하기 :"+stack);
		
		int top = stack.peek();
		System.out.println("5. peek() :"+top);
		
		int a = stack.size();
		System.out.println("6. size() "+a);
		
		boolean value = stack.isEmpty();
		System.out.println("7. isEmpty(): "+value);
		
	}
}
