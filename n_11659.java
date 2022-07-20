import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());	
		st= new StringTokenizer(br.readLine());
		
		int arr[] =new int[n];
		int sum[] =new int[n+1];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sum[1]=arr[0];
		for (int i=2; i<n+1; i++) {
			sum[i] = sum[i-1] + arr[i-1];
		}
		for (int i=0; i<m; i++) {
			st= new StringTokenizer(br.readLine());
			int i1= Integer.parseInt(st.nextToken());
			int j1= Integer.parseInt(st.nextToken());
			
			System.out.println(sum[j1] - sum[i1-1]);
			
		}
	}

}
