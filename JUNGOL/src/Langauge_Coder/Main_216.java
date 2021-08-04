package Langauge_Coder;

import java.util.Scanner;

public class Main_216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			if(line.equals("END")) {
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=line.length()-1; i>=0; i--) {
				sb.append(line.charAt(i));
			}
			System.out.println(sb);
		}
	}
}
