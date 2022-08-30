import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n_11725 {
	static int n, route;
	static ArrayList<ArrayList<Integer>> list;
	static int parents[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		parents = new int[n+1]; // �� ����� �θ� ��� ������ �迭
		list = new ArrayList<>(); // 1~n ��忡 � ��尡 ����Ǿ����� Ȯ���� �迭
		
		// Ʈ���� ��尡 2�� ����� �� �־ list �ȿ� ArrayList�� �� �� �� �־��ش�
		for(int i=0; i<=n+1; i++) list.add(new ArrayList<Integer>());
		
		int a,b;
		for(int i=1; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
			// i ��° ��忡 � ������ ����Ǿ� �ִ��� Ȯ��
			// ������̶� a,b �� ���ش�
			list.get(a).add(b); list.get(b).add(a);
		}
		bfs();
		
		for(int i=2; i<parents.length; i++) System.out.println(parents[i]);
	}
	
	
	private static void bfs() {
		route = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(route);
		parents[route] = 1; // ��Ʈ ���� 1�� ����
		
		while(!queue.isEmpty()) {
			int parent = queue.poll();
			for(int i : list.get(parent)) {
				if(parents[i] == 0) {
					parents[i] = parent;
					queue.offer(i);
				}
			}
		}
	}
}

