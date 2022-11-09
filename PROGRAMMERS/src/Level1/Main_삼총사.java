package Level1;

import java.util.Arrays;

/**
 * @site https://school.programmers.co.kr/learn/courses/30/lessons/131705?language=java
 * @author NUSTAR
 * @Level1 연습문제 > 삼총사
 */
public class Main_삼총사 {
	public static void main(String[] args) {
		int answer = solution(new int[] { -2, 3, 0, 2, -5 });
		System.out.println(answer);
		answer = solution(new int[] { -3, -2, -1, 0, 1, 2, 3 });
		System.out.println(answer);
		answer = solution(new int[] { -1, 1, -1, 1 });
		System.out.println(answer);
	}

	static int solution(int[] number) {
		result = 0;
		sel = new int[3];
		combination(number, 0, number.length, 3, 0);
		return result;
	}

	static int sel[];
	static int result;

	static void combination(int[] number, int idx, int N, int K, int cnt) {
		if (idx == K) {
			int answer = three();
			if (answer == 0) {
				result++;
			}
			return;
		}
		if (cnt == N) {
			return;
		}
		sel[idx] = number[cnt];
		combination(number, idx + 1, N, K, cnt + 1);
		combination(number, idx, N, K, cnt + 1);
	}

	static int three() {
		int answer = 0;
		for (int i = 0; i < sel.length; i++) {
			answer += sel[i];
		}
		return answer;
	}
}
