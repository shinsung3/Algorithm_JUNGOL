package Langauge_Coder;

import java.util.Scanner;

public class Main_612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		
		String arr[] = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}

		StringBuilder answer = new StringBuilder();
		int cnt = 0;
		for(int i=0; i<sb.length(); i++) {
			answer.append(sb.toString().charAt(i));
			cnt++;
			if(cnt==3) {
				System.out.println(answer);
				answer = new StringBuilder();
				cnt=0;
			}
		}
		System.out.println(answer);
		
	}
	private static String src = "12 5963 58 1 45678";
}
