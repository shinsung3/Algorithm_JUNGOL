package Langauge_Coder;

import java.util.Scanner;

public class Main_237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line[] = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		sb.append(line[0]);
		boolean isDouble = false;
		int cnt = 0;
		for(int i=0; i<line[1].length(); i++) {
			if(cnt==3){
				boolean isCheck = false;
				if(i+1 <line[1].length()) {
					if(line[1].charAt(i+1)-'0'>=5) {
						isCheck = true;
						int answer = (line[1].charAt(i)-'0')+1;
						sb.append(answer);
					}
				}
				if(!isCheck) {
					sb.append(line[1].charAt(i));
				}
				break;
			}
			sb.append(line[1].charAt(i));
			if(line[1].charAt(i)=='.') {
				isDouble = true;
			}
			if(isDouble) {
				cnt++;
			}
		}
		sb.append(line[2]);
		
		if(sb.length()%2==0) {
			System.out.println(sb.substring(0,sb.length()/2));
			System.out.println(sb.substring(sb.length()/2, sb.length()));
		}else {
			System.out.println(sb.substring(0,sb.length()/2+1));
			System.out.println(sb.substring(sb.length()/2+1, sb.length()));
		}
	}
}
