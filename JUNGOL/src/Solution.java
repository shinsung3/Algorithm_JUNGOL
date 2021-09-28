
public class Solution {
	// main method
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false, true};
		solution(absolutes, signs);
	}

	//static을써준다.
	static int solution(int[] absolutes, boolean[] signs) {
		int answer = 123456789;
		//int[] 배열에 있는 모든 값을 더할 건데, 값들의 부호는 signs -> false ="마이너스" true = "플러스"
		//모든 데이터를 탐색한다.
		int sum = 0; //값에 대한 부호 + - + absolutes.length = signs.length 
		for(int i=0; i<absolutes.length; i++) {//for i in absolutes:
			if(signs[i]==true) {
				//4라는 숫자의 부호를 나타낸다.
				sum += absolutes[i];
			}else {
				sum -= absolutes[i]; //7 false = -7
			}
		}
//		System.out.println(answer); //4 -7 12
		//1. answer에게 sum값을 줍니다.
//		answer = sum;
//		System.out.println(answer);
		
		//2. answer를 처음부터 활용한다.
		
		//3. sum자체를 제출한다.
		System.out.println(sum);
//		String ans = "HELLO";
		return sum; //answer , sum => [DATA TYPE]
	}
}
