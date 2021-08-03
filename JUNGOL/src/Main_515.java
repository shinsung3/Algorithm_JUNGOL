import java.util.Scanner;

public class Main_515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Standard Input
		int a;
		int b;

		a = sc.nextInt();
		b = sc.nextInt();

		int sum;
		sum = a*b;
		
		int div;
		div = a/b;
		
		System.out.println(a+" * "+b+" = "+sum);
		System.out.println(a+" / "+b+" = "+div);
		
	}
}
