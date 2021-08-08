package Level2;

import java.util.Arrays;

public class Main_2개이하로다른비트 {
	public static void main(String[] args) {
		long arr[] = { 2, 9 };
		long[] answer = solution(arr);
		System.out.println(Arrays.toString(answer));
	}

	static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		String func[] = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			long value = numbers[i];
			String key = Long.toBinaryString(value);
			if (value % 2 == 0) {
				answer[i] = value + 1;
			} else {
				int index = key.lastIndexOf("0");
				StringBuilder sb = new StringBuilder();
				if (index == -1) {
					value++;
					key = Long.toBinaryString(value);
					sb.append("10");
					sb.append(key.substring(2, key.length()).replace("0", "1"));
				} else {
					int first = key.indexOf("1", index);
					sb.append(key.substring(0, index));
					sb.append("1");
					sb.append(key.substring(index + 1, first));
					sb.append("0");
					sb.append(key.substring(first + 1, key.length()));
				}
				answer[i] = Long.parseLong(sb.toString(), 2);
			}
		}
		return answer;
	}
}