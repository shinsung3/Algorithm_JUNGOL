package Langauge_Coder;

import java.util.Scanner;

public class Main_521 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = (a++)*(--b);
		System.out.println(a+" "+b+" "+ans);
		
	}
}
