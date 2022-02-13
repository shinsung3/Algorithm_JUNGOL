package easy;

import java.util.Arrays;

public class Solution_01_twoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		out: for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					int sum = key + nums[j];
					if (sum == target) {
						answer[0] = i;
						answer[1] = j;
						break out;
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] answer = twoSum(nums, target);
		System.out.println(Arrays.toString(answer));
	}
}