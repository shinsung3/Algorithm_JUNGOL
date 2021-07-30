package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_행렬테두리회전하기 {
	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };
		int[] answer = solution(rows, columns, queries);
		System.out.println(Arrays.toString(answer));
	}

	static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		int[][] map = new int[rows][columns];
		int idx = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				map[i][j] = idx;
				idx++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			int x1 = queries[i][0] - 1;
			int y1 = queries[i][1] - 1;
			int x2 = queries[i][2] - 1;
			int y2 = queries[i][3] - 1;

			List<Integer> list = new ArrayList<Integer>();

			// 위쪽
			for (int j = y1; j <= y2; j++) {
				list.add(map[x1][j]);
			}

			// 오른쪽
			for (int j = x1 + 1; j <= x2; j++) {
				list.add(map[j][y2]);
			}

			// 아래쪽
			for (int j = y2 - 1; j >= y1; j--) {
				list.add(map[x2][j]);
			}

			// 왼쪽
			for (int j = x2 - 1; j >= x1 + 1; j--) {
				list.add(map[j][y1]);
			}

			int min = Integer.MAX_VALUE;
			for (int j = 0; j < list.size(); j++) {
				min = Math.min(min, list.get(j));
			}
			answer[i] = min;

			int key = 0;
			boolean isChecked = true;
			// 위쪽
			for (int j = y1; j <= y2; j++) {
				// 제일 첫번째꺼는 빼두고 시작하려고
				if (isChecked) {
					isChecked = false;
				} else {
					map[x1][j] = list.get(key);
					key++;
				}
			}

			// 오른쪽
			for (int j = x1 + 1; j <= x2; j++) {
				// 제일 첫번째꺼는 빼두고 시작하려고
				if (isChecked) {
					isChecked = false;
				} else {
					map[j][y2] = list.get(key);
					key++;
				}
			}

			// 아래쪽
			for (int j = y2 - 1; j >= y1; j--) {
				// 제일 첫번째꺼는 빼두고 시작하려고
				if (isChecked) {
					isChecked = false;
				} else {
					map[x2][j] = list.get(key);
					key++;
				}
			}

			// 왼쪽
			for (int j = x2 - 1; j >= x1; j--) {
				// 제일 첫번째꺼는 빼두고 시작하려고
				if (isChecked) {
					isChecked = false;
				} else {
					map[j][y1] = list.get(key);
					key++;
				}
			}

		}

		return answer;
	}
}
