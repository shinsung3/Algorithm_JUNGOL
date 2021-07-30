
import java.util.Scanner;

public class Main_608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		if(line.contains("c")) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		System.out.print(" ");
		if(line.contains("ab")) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}
