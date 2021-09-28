import java.util.Scanner;
import java.util.Stack;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		Stack<Integer> stack = new Stack<Integer>();

		scanner.nextLine();

		for (int i = 0; i < a; i++) {
			String s = scanner.nextLine();
			String[] s1 = s.split(" ");

			if (s.contains("push")) {
				int number = Integer.parseInt(s1[1]);
				stack.push(number);
			} else if (s.contains("top")) {
				if (stack.isEmpty() == false) {
					int top = stack.peek();
					System.out.println(top);
				} else {
					System.out.println("-1");
				}
			} else if (s.contains("size")) {
				int size = stack.size();
				System.out.println(size);
			} else if (s.contains("empty")) {
				if (stack.isEmpty() == true) {
					System.out.println("-1");
				} else {
					System.out.println("0");
				}
			} else if (s.contains("pop")) {
				if (stack.isEmpty() == false) {
					System.out.println(stack.peek());
					stack.pop();
				} else {
					System.out.println("-1");
				}
			}
		}
	}
}