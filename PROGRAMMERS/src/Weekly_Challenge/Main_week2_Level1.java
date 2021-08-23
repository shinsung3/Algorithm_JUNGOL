package Weekly_Challenge;

public class Main_week2_Level1 {
	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
//		int[][] scores = {{50,90},{49,87}};
//		int[][] scores = { { 90, 90, 90 }, { 50, 50, 49 }, { 80, 80, 79 } };
		String answer = solution(scores);
		System.out.println(answer);
	}

	static String solution(int[][] scores) {
		String answer = "";
		for (int i = 0; i < scores.length; i++) {
			int max = -1;
			int min = Integer.MAX_VALUE;
			int value = 0;
			int len = scores.length;
			int cnt = 0;
			for (int j = 0; j < scores[0].length; j++) {
				max = Math.max(max, scores[j][i]);
				min = Math.min(min, scores[j][i]);
				value += scores[j][i];
				if (j != i && scores[i][i] == scores[j][i]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				if (scores[i][i] == max || scores[i][i] == min) {
					len--;
					value -= scores[i][i];
				}
			}
			double myPoint = (double) value / (double) len;
			if (myPoint >= 90.0) {
				answer += "A";
			} else if (myPoint >= 80.0 && myPoint < 90.0) {
				answer += "B";
			} else if (myPoint >= 70.0 && myPoint < 80.0) {
				answer += "C";
			} else if (myPoint >= 50.0 && myPoint < 70.0) {
				answer += "D";
			} else if (myPoint < 50.0) {
				answer += "F";
			}
		}

		return answer;
	}
}
