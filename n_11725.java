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
		parents = new int[n+1]; // 각 노드의 부모 노드 저장할 배열
		list = new ArrayList<>(); // 1~n 노드에 어떤 노드가 연결되었는지 확인할 배열
		
		// 트리라 노드가 2개 연결될 수 있어서 list 안에 ArrayList를 한 번 더 넣어준다
		for(int i=0; i<=n+1; i++) list.add(new ArrayList<Integer>());
		
		int a,b;
		for(int i=1; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
			// i 번째 노드에 어떤 노드들이 연결되어 있는지 확인
			// 양방향이라서 a,b 다 해준다
			list.get(a).add(b); list.get(b).add(a);
		}
		bfs();
		
		for(int i=2; i<parents.length; i++) System.out.println(parents[i]);
	}
	
	
	private static void bfs() {
		route = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(route);
		parents[route] = 1; // 루트 노드는 1로 고정
		
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

