package Level1;

public class Main_나머지가1이되는수찾기 {
	public static void main(String[] args) {
		int n = 10;
		int ans = solution(n);
		System.out.println(ans);
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
