package Level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main_모두0으로만들기 {
	public static void main(String[] args) {
		int[] a = { -5, 0, 2, 1, 2 };
		int[][] edges = { { 0, 1 }, { 3, 4 }, { 2, 3 }, { 0, 3 } };
		long answer = solution(a, edges);
		System.out.println(answer);
	}

	static long solution(int[] a, int[][] edges) {
		long answer = -2;
		boolean isZero = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				isZero = false;
				break;
			}
		}
		if (isZero) {
			return 0;
		} else {
			long arr[] = new long[a.length];
			long sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
				arr[i] = a[i];
			}
			if (sum != 0) {
				return -1;
			} else {
				int[] edge = new int[a.length]; // 정점
				List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
				for (int i = 0; i < edge.length; i++) {
					list.add(new ArrayList<Integer>()); // 정점의 배열
				}

				for (int i = 0; i < edges.length; i++) {
					int v1 = edges[i][0];
					int v2 = edges[i][1];
					list.get(v1).add(v2); // 정점설정
					list.get(v2).add(v1);
					edge[v1]++; // 간선의 개수 추가
					edge[v2]++; // 간선의 개수 추가
				}

				answer = topologicalSort(list, edge, arr);
			}
			return answer;
		}
	}

	private static long topologicalSort(List<ArrayList<Integer>> list, int[] edge, long[] arr) {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < edge.length; i++) {
			if (edge[i] == 1) {
				q.add(i); // 리프 노드 넣기
			}
		}

//		System.out.println(Arrays.toString(edge));
//		for (List<Integer> b : list) {
//			System.out.println(b);
//		}
		boolean visit[] = new boolean[edge.length];
		long answer = 0;
		while (!q.isEmpty()) {
			int current = q.poll();
			visit[current] = true;

//			System.out.println("시작점 : " + current);
			for (int next : list.get(current)) {
				if(!visit[next]) {
					edge[next]--;
					arr[next] += arr[current];
					answer += Math.abs(arr[current]);
					arr[current] =0;
					if (edge[next] == 1) {
						q.add(next); // 리프 노드 넣기
					}
				}
				
				
			}
		}
		return answer;
	}
}
