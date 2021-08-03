package Weekly_Challenge;

public class Main_week1 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long answer = solution(price, money, count);
		System.out.println(answer);
	}

	static long solution(int price, int money, int count) {
		long answer = -1;
		long total = 0;
		for(int i=1; i<=count; i++) {
			total += price*i;
		}
		if(money>=total) {
			answer = 0;
		}else {
			answer = total-money;
		}
		return answer;
	}
}
