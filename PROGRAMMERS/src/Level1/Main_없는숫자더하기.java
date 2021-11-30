package Level1;

import java.util.Arrays;

public class Main_없는숫자더하기 {
	// 1. Main Method 만들기
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int ans = solution(numbers);
		System.out.println(ans);
	}

	// 2. static 쓰고 뒤에를 붙인다.
	static int solution(int[] numbers) {
		int answer = 0;
		boolean[] count = new boolean[10];
		for (int i = 0; i < numbers.length; i++) {
			count[numbers[i]] = true;
		}
		for (int i = 0; i < count.length; i++) {
			if (!count[i]) {
				answer += i;
			}
		}
		return answer;
	}
}