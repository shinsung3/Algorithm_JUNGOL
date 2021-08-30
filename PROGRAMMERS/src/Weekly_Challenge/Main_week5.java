package Weekly_Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main_week5 {
	public static void main(String[] args) {
		String word = "AAAE";
		int answer = solution(word);
		System.out.println(answer);
	}

	static Queue<String> q;
	static Set<String> set;

	static int solution(String word) {
		int answer = 0;
		// A 5개 
		q = new LinkedList<String>();
		set = new HashSet<String>();
		setting("A");
		// E 5개
		setting("E");
		// I 5개
		setting("I");
		// O 5개
		setting("O");
		// U 5개
		setting("U");

		String[] arr = { "A", "E", "I", "O", "U" };
		while (!q.isEmpty()) {
			String key = q.poll();
			if (key.length() == 5) {
				continue;
			}
			for (int i = 0; i < 5; i++) {
				String value = key + arr[i];
				set.add(value);
				q.add(value);
			}
		}
		List<String> list = new ArrayList<String>();
		for (String a : set) {
			list.add(a);
		}
		Collections.sort(list);
		
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).equals(word)) {
				answer = i+1;
			}
		}
		
		return answer;
	}

	static void setting(String key) {
		String value = key;
		for (int i = 0; i < 5; i++) {
			q.add(key);
			set.add(key);
			key += value;
		}
	}
}
