package Wadiz_Coding_Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
//		int[][] passwords = { { 101, 1234 }, { 102, 54321 }, { 201, 202 }, { 202, 1 } };
		int[][] passwords = {{101,9999},{102,1111}};
//		String s = "101#1234#102#654321#51#203#201#202#1#";
		String s = "201#9999#101#";
		int ans = solution(passwords, s);
		System.out.println(ans);
	}

	static int solution(int[][] passwords, String s) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < passwords.length; i++) {
			map.put(passwords[i][0], passwords[i][1]);
		}
		String[] value = s.split("#");
		int idx = 0;
		while (true) {
			if(idx>=value.length)
				break;
			Set<Integer> key = map.keySet();
			int keys = Integer.parseInt(value[idx]);
			System.out.println(keys);
			for(int a : key) {
				if(keys == a) {
					idx++;
					if(idx>=value.length)
						break;
					int compareValue = Integer.parseInt(value[idx]);
					if(map.get(a)==compareValue) {
						answer++;
					}
				}
			}
			idx++;
		}
		return answer;
	}
}
