package Weekly_Challenge;

import java.util.Arrays;
import java.util.List;

public class Main_week4 {
	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
//		String[] languages = { "PYTHON", "C++", "SQL" };
		String[] languages = {"JAVA", "JAVASCRIPT"};
		int[] preference = { 7, 5};
		String answer = solution(table, languages, preference);
		System.out.println(answer);
	}

	static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";

		int[] total = new int[table.length];
		for (int i = 0; i < 5; i++) {
			total[i] = calculate(table[i].split(" "), preference, languages);
		}

		int max = 0;
		int idx = 0;
		for (int i = 0; i < total.length; i++) {
			if (max < total[i]) {
				max = total[i];
				idx = i;
			} else if (max == total[i]) {
				if(table[idx].split(" ")[0].compareTo(table[i].split(" ")[0])>0) {
					idx = i;
				}
			}
		}
		answer = table[idx].split(" ")[0];
		return answer; 
	}

	static int calculate(String[] keys, int[] preference, String[] languages) {
		int sum = 0;
		for (int i = 0; i < languages.length; i++) {
			int value = 0;
			for (int j = 0; j < keys.length; j++) {
				if (languages[i].equals(keys[j])) {
					value = 6 - j;
					break;
				}
			}
			sum += preference[i] * value;
		}
		return sum;
	}
}
