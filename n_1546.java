import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		double avg;
		
		int max =arr[0], sum =0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (max<arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		avg = 100.0 *sum / n /max;
		System.out.println(avg);

	}
}
