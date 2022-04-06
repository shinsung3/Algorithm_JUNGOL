package Level2;

import java.util.Arrays;

public class Main_K진수에서소수개수구하기 {
	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
//		n = 110011;
//		k = 10;
//		n = 102;
//		k = 10;
		int answer = solution(n, k);
		System.out.println(answer);
	}

	public static int solution(int n, int k) {
		int answer = 0;
		String kth = "";
		if (k == 10) {
			kth = Integer.toString(n);
		} else {
			kth = makeKth(n, k);
		}
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= 1000000; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= 1000000; j += i) {
					prime[j] = true;
				}
			}
		}

		String[] arr = kth.split("0");
//		System.out.println(kth);
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() != 0) {
				long value = Long.parseLong(arr[i]);
				boolean flag = true;
//				System.out.println(value);
				if (value == 2) {
					flag = true;
				} else if (value == 1) {
					flag = false;
				} else {
					for (int j = 2; j <= (int) Math.sqrt(value); j++) {
						if (value % j == 0) {
							flag = false;
							break;
						}
					}
				}
//				System.out.println(flag);
				if (flag) {
					answer++;
				}
			}
		}

		return answer;
	}

	/*
	 * k진수 만들기
	 */
	static String makeKth(int n, int k) {
		StringBuilder sb = new StringBuilder();
		while (true) {
			if (n == 0) {
				break;
			}
			long value = n % k;
			sb.append(value);
			n = n / k;
		}
		sb = sb.reverse();
		return sb.toString();
	}
}
