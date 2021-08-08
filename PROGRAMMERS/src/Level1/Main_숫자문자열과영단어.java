package Level1;


import java.util.HashMap;

public class Main_숫자문자열과영단어 {
	public static void main(String[] args) {
		String s = "2three45sixseven";
		int a = solution(s);
		System.out.println(a);
	}

	static int solution(String s) {
		int answer = 0;
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("zero", 0);
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("six", 6);
		hm.put("seven", 7);
		hm.put("eight", 8);
		hm.put("nine", 9);

		int idx = 0;
		StringBuilder sb = new StringBuilder();
		while (true) {
			if (idx >= s.length()) {
				break;
			}
			if (s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
				sb.append(s.charAt(idx));
				idx++;
			} else {
				for (String key : hm.keySet()) {
					int index = idx;
					boolean isSame = true;
					for (int i = 0; i < key.length(); i++) {
						if (s.charAt(index) != key.charAt(i)) {
							isSame = false;
							break;
						} else {
							index++;
						}
					}
					if (isSame) {
						idx = index;
						sb.append(hm.get(key));
						break;
					}
				}
			}
		}
		answer = Integer.parseInt(sb.toString());
		return answer;
	}
}