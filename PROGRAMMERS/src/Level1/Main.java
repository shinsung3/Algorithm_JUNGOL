package Level1;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
	// 1. Main Method 만들기
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		int[] ans = solution(numbers);
		System.out.println(Arrays.toString(ans));
	}

	// 2. static 쓰고 뒤에를 붙인다.
	static int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()];
		int idx = 0;
		for (int a : set) {
			answer[idx] = a;
			idx++;
		}
		
		Arrays.sort(answer);

		return answer;
	}
}