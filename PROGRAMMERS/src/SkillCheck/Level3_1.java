package SkillCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Level3_1 {
	public static void main(String[] args) {
		String[] genres = { "classic", "pop" };
		int[] plays = { 500, 500 };
		int[] arr = solution(genres, plays);
		System.out.println(Arrays.toString(arr));
	}

	static int[] solution(String[] genres, int[] plays) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < genres.length; i++) {
			if (map.containsKey(genres[i])) {
				int value = map.get(genres[i]);
				map.put(genres[i], plays[i] + value);
			} else {
				map.put(genres[i], plays[i]);
			}
		}
		List<Sort> list = new ArrayList<>();
		Set<String> set = map.keySet();

		for (String a : set) {
			int value = map.get(a);
			list.add(new Sort(a, value));
		}

		Collections.sort(list, new Comparator<Sort>() {

			@Override
			public int compare(Sort o1, Sort o2) {
				// TODO Auto-generated method stub
				return o2.value - o1.value;
			}
		});

		List<Sort> sortList = new ArrayList<>();
		for (int i = 0; i < genres.length; i++) {
			sortList.add(new Sort(genres[i], plays[i], i));
		}

		Collections.sort(sortList, new Comparator<Sort>() {

			@Override
			public int compare(Sort o1, Sort o2) {
				// TODO Auto-generated method stub
				if (o2.idx - o1.idx == 0) {
					return o2.idx - o1.idx;
				} else {
					return o2.value - o1.value;
				}
			}
		});
		
//		System.out.println(sortList);
//		System.out.println(list);
		List<Integer> ans = new ArrayList<Integer>();
		for (Sort s : list) {
			String genre = s.genre;
			int cnt = 0;
			for (int i = 0; i < sortList.size(); i++) {
				if (genre.equals(sortList.get(i).genre)) {
					ans.add(sortList.get(i).idx);
					cnt++;
				}
				if (cnt == 2) {
					break;
				}
			}
		}

		int[] answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}

	static class Sort {
		String genre;
		int value;
		int idx;

		public Sort(String genre, int value) {
			super();
			this.genre = genre;
			this.value = value;
		}

		public Sort(String genre, int value, int idx) {
			super();
			this.genre = genre;
			this.value = value;
			this.idx = idx;
		}

		@Override
		public String toString() {
			return "Sort [genre=" + genre + ", value=" + value + ", idx=" + idx + "]";
		}

	}
}
