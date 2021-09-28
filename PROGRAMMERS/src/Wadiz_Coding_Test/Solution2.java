package Wadiz_Coding_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		String[] code = { "a=3", "..a=4", "..b=3", "..print a", ".......a=6", ".......print a", ".......print b",
				"..print a", "....a=7", "....print a", "print a", "print b", "a=4", "print a", "...print a" };
		String[] answer = solution(code);
		System.out.println(Arrays.toString(answer));
	}

	static String[] solution(String[] code) {
		List<CodeSummary> list = new ArrayList<>();
		List<String> ans = new ArrayList<String>();
		int maxDot = -1;
		for (int i = 0; i < code.length; i++) {
//			System.out.println(code[i]);
			int dotCnt = 0;
			
			if (code[i].contains("=")) {
				String[] value = code[i].split("=");
				for (int j = 0; j < value[0].length(); j++) {
					if (value[0].charAt(j) == '.') {
						dotCnt++;
					}
				}
				if (maxDot <= dotCnt) {
					maxDot = dotCnt;
				} else {
					maxDot = dotCnt;
					int idx = 0;
					while(true) {
						if(idx>=list.size()) {
							break;
						}
						if(list.get(idx).dotCnt>maxDot) {
							list.remove(idx);
						}else {
							idx++;
						}
					}
				}
				value[0] = value[0].substring(dotCnt);
				list.add(new CodeSummary(value[0], dotCnt, Integer.parseInt(value[1])));
			}
			if (code[i].contains("print")) {
				String[] print = code[i].split(" ");
				String[] value = code[i].split("print");
				for(int j=0; j<value[0].length(); j++) {
					if (value[0].charAt(j) == '.') {
						dotCnt++;
					}
				}
				if (maxDot <= dotCnt) {
					maxDot = dotCnt;
				} else {
					maxDot = dotCnt;
					int idx = 0;
					while(true) {
						if(idx>=list.size()) {
							break;
						}
						if(list.get(idx).dotCnt>maxDot) {
							list.remove(idx);
						}else {
							idx++;
						}
					}
				}
				boolean check = false;
				for(int j=list.size()-1; j>=0; j--) {
					if(list.get(j).name.equals(print[1])) {
						check = true;
						String answer1 = print[1]+"="+list.get(j).value;
						ans.add(answer1);
						break;
					}
				}
				if(!check) {
					ans.add("error");
				}
			}
		}
		String[] answer = new String[ans.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}

	static class CodeSummary {
		String name;
		int dotCnt;
		int value;

		public CodeSummary(String name, int dotCnt, int value) {
			super();
			this.name = name;
			this.dotCnt = dotCnt;
			this.value = value;
		}

		@Override
		public String toString() {
			return "CodeSummary [name=" + name + ", dotCnt=" + dotCnt + ", value=" + value + "]";
		}
	}
}
