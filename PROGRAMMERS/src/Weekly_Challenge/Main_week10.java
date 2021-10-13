package Weekly_Challenge;

import java.util.Arrays;
import java.util.HashSet;

public class Main_week10 {
	public static void main(String[] args) {
		String[] answer = solution(new int[][] { { 100000, 100000, 100000 }, { 0, 100000, 100000 }, { 0, -1, 1 },
				{ 5, -8, -12 }, { 5, 8, 12 } });
		System.out.println(Arrays.toString(answer));
	}

	static String[] solution(int[][] line) {
		boolean isZero = true;
		HashSet<long[]> set = new HashSet<long[]>();
		for (int i = 0; i < line.length; i++) {
			int A = line[i][0];
			int B = line[i][1];
			int E = line[i][2];
			for (int j = i; j < line.length; j++) {
				if (i != j) {
					int C = line[j][0];
					int D = line[j][1];
					int F = line[j][2];
					long bunmo = (long) A * (long) D - (long) B * (long) C;

					// 분모가 0이라면 평행하거나 일치한 것. 아무것도 하지 않을 것임
					if (bunmo != 0) {
						isZero = false;
						long bunjaOne = (long) B * (long) F - (long) D * (long) E;
						long bunjaTwo = (long) C * (long) E - (long) A * (long) F;

						double x = (double) bunjaOne / (double) bunmo;
						double y = (double) bunjaTwo / (double) bunmo;

						if (x == Math.ceil(x) && y == Math.ceil(y)) {
							long a[] = new long[2];
							a[0] = (long) x;
							a[1] = (long) y;
							set.add(a);
						}
					}
				}
			}
		}
		if (isZero) {
			return new String[] { "." };
		} else {

			long xMax = Long.MIN_VALUE;
			long xMin = Long.MAX_VALUE;
			long yMax = Long.MIN_VALUE;
			long yMin = Long.MAX_VALUE;
			for (long a[] : set) {
				if (a[0] > xMax) {
					xMax = a[0];
				}
				if (a[0] < xMin) {
					xMin = a[0];
				}
				if (a[1] > yMax) {
					yMax = a[1];
				}
				if (a[1] < yMin) {
					yMin = a[1];
				}
//			System.out.println(Arrays.toString(a));
			}
//		System.out.println(xMax + " " + xMin + " " + yMax + " " + yMin);
			int len = (int) (yMax - yMin + 1);
			int xLen = (int) (xMax - xMin + 1);
			String[] answer = new String[len];

			String temp = "";
			for (int i = 0; i < xLen; i++) {
				temp += ".";
			}
			for (int i = 0; i < len; i++) {
				answer[i] = temp;
			}

			long idx = yMax;
			for (int i = 0; i <= len; i++) {
				for (long[] a : set) {
					if (a[1] == idx) {
						StringBuilder sb = new StringBuilder();
						int ii = 0;
						for (long j = xMin; j <= xMax; j++) {
							if (a[0] == j) {
								sb.append("*");
							} else {
								sb.append(answer[i].charAt(ii));
							}
							ii++;
						}
						answer[i] = sb.toString();
					}
				}
				idx--;
//			System.out.println(Arrays.toString(answer));
			}

			return answer;
		}
	}
}
