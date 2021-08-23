package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_거리두기확인하기 {
	public static void main(String[] args) {
		String[][] places = { { "OOOXX", "XOOOX", "OOOXX", "OXPOP", "OOOOO" },
				{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX" },
				{ "OOOXX", "XOOOX", "OOOXX", "OXPOP", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };
		int[] answer = solution(places);
		System.out.println(Arrays.toString(answer));
	}

	static int[] solution(String[][] places) {
		int[] answer = new int[places.length];
		for (int i = 0; i < places.length; i++) {
			char[][] map = new char[places.length][places.length];
			for (int j = 0; j < places[i].length; j++) {
				char[] value = places[i][j].toCharArray();
				map[j] = value;
			}
			for (char[] a : map)
				System.out.println(Arrays.toString(a));
			System.out.println();
			answer[i] = bfs(map);
		}
		return answer;
	}

	static int bfs(char[][] map) {
		boolean[][] visit = new boolean[5][5];
		Queue<Node> q = new LinkedList<>();
		int[] Y = { -1, 1, 0, 0 };
		int[] X = { 0, 0, -1, 1 };
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 'P') {
					boolean flag = false;
					q.add(new Node(i, j));
					visit[i][j] = true;
					int cnt = 0;
					while (!q.isEmpty()) {
						Node n = q.poll();
						for (int idx = 0; idx < 4; idx++) {
							int ny = Y[idx] + n.y;
							int nx = X[idx] + n.x;

							if (ny < 0 || nx < 0 || ny >= 5 || nx >= 5)
								continue;
							if (map[ny][nx] == 'X')
								continue;
							if (visit[ny][nx])
								continue;
							if (map[ny][nx] == 'P') {
								flag = true;
							}
							if (cnt == 0) {
								q.add(new Node(ny, nx));
								visit[ny][nx] = true;
							}
							if (flag) {
								break;
							}
						}

						if (flag) {
							break;
						}
						cnt++;
					}
					q.clear();
					if (flag) {
						return 0;
					}
				}
			}
		}
		return 1;
	}

	static class Node {
		int y;
		int x;

		public Node(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		@Override
		public String toString() {
			return "Node [y=" + y + ", x=" + x + "]";
		}
	}
}
