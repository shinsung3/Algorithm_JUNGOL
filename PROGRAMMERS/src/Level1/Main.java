package Level1;

public class Main {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm123_-";
		String a = solution(new_id);
		System.out.println(a);
	}

	static String solution(String new_id) {
		String answer = "";

		// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();
		System.out.println("1단계: "+new_id);

		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < new_id.length(); i++) {
			char temp = new_id.charAt(i);
			if ((temp >= 'a' && temp <= 'z') || temp == '_' || (temp-'0'>=0 && temp-'0'<=9) ||temp=='.' || temp=='-') {
				sb.append(temp);
			}
		}
		new_id = sb.toString();
		System.out.println("2단계: "+new_id);
		
		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		sb = new StringBuilder();
		int cnt = 0;
		for(int i=0; i<new_id.length(); i++) {
			if(new_id.charAt(i)=='.') {
				cnt++;
			}else {
				if(cnt!=0) {
					sb.append(".").append(new_id.charAt(i));
					cnt=0;
					
				}else {
					sb.append(new_id.charAt(i));
				}
			}
		}
		new_id = sb.toString();
		System.out.println("3단계: "+new_id );
		
		// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if(new_id.charAt(0)=='.') {
			new_id = new_id.substring(1);
		}
		
		
		return answer;
	}
}
