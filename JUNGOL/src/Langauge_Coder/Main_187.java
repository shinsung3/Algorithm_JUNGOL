package Langauge_Coder;

import java.util.*;

public class Main_187 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		while (true) {
			if (line.length() == 1) {
				break;
			}
			int idx = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			if (line.length() <= idx) {
				for (int i = 0; i < line.length() - 1; i++) {
					sb.append(line.charAt(i));
				}
			} else {
				for (int i = 0; i < line.length(); i++) {
					if ((idx-1) == i) {
						continue;
					}
					sb.append(line.charAt(i));
				}
			}
			System.out.println(sb.toString());
			line = sb.toString();
		}
	}

}
