package Level0;

public class Solution_특정문자제거하기 {
	/* 특정 문자 제거하기 */ 
	public static void main(String[] args) {
		String answer = solution("BCBdbe", "B");
		System.out.println(answer);
	}
	public static String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}
