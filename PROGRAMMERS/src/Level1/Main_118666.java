package Level1;

import java.util.HashMap;

//KAKAO TECH INTERSHIP - 성격 유형 검사하기
public class Main_118666 {
	public static String solution(String[] survey, int[] choices) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);

		// 1.숫자가 크면 뒤에꺼 작으면 앞에꺼
		for (int i = 0; i < choices.length; i++) {
			char key = survey[i].charAt(1);
			if (choices[i] == 4)
				continue;
			if (choices[i] < 4) {
				key = survey[i].charAt(0);
			}
			int value = map.get(key);

			if (choices[i] == 7 || choices[i] == 1) {
				value += 3;
			} else if (choices[i] == 6 || choices[i] == 2) {
				value += 2;
			} else {
				value += 1;
			}
			map.put(key, value);
		}
		
		StringBuilder sb =new StringBuilder();
		//RT, CF, JM, AN
		int R = map.get('R');
		int T = map.get('T');
		if(T>R) {
			sb.append("T");
		}else{
			sb.append("R");
		}

		int C = map.get('C');
		int F = map.get('F');
		if(F>C) {
			sb.append("F");
		}else {
			sb.append("C");
		}

		int J = map.get('J');
		int M = map.get('M');
		if(M>J) {
			sb.append("M");
		}else {
			sb.append("J");
		}

		int A = map.get('A');
		int N = map.get('N');
		if(N>A) {
			sb.append("N");
		}else {
			sb.append("A");
		}
//		System.out.println(map);
		return sb.toString();
	}

	public static void main(String[] args) {
		String survey[] = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		String answer1 = solution(survey, choices);

		survey = new String[] { "TR", "RT", "TR" };
		choices = new int[] { 7, 1, 3 };
		String answer2 = solution(survey, choices);

		System.out.println(answer1);
		System.out.println(answer2);
	}
}