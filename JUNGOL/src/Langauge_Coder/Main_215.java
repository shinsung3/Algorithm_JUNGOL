package Langauge_Coder;

import java.util.Scanner;

public class Main_215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		String a = sc.next();
		String b = sc.next();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
				sb.append(a.charAt(i));
			else
				break;
		}
		
		int N = Integer.parseInt(sb.toString());
		
		sb = new StringBuilder();
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) >= '0' && b.charAt(i) <= '9')
				sb.append(b.charAt(i));
			else
				break;
		}
		
		int M = Integer.parseInt(sb.toString());
		
		System.out.println(N*M);
	}

	private static String src = "123.45  67@12";
}
