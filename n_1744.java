import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	
		int[] arr = new int[n];
		int minus = 0;
		for (int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i]<=0) {
				minus++;
			}
		}
		Arrays.sort(arr);
		int ans =0; 
		// 젤 작은 음수부터 두개씩 곱하기
		for (int i=1; i<minus; i++ ) {
			ans += (arr[i-1] * arr[i]);
		}
		if (minus %2 == 1) { 	//음수의 갯수가 홀수일때 그냥 다음수와 더 하기  
			ans += arr[minus-1];
		}
		if ((n-minus)%2==1) { // 양수의 갯수가 홀수면 그 숫자만 더하기 
			ans += arr[minus];
		}
		for(int i= n-1; i>minus; i-=2) { // 양수부분 두개씩 묶기
			int mul = arr[i] * arr[i-1];
			int sum = arr[i] + arr[i-1];
			if (mul > sum) {
				ans += mul;
			}
			else { // 양수여도 1이 존재할 경우 
				ans += sum;
			}
		}
		System.out.println(ans);
		
//		음수 , 음수  ( -2 * -2 = 4)
//		음수 , 0 ( -2 * 0 = 0)
//		0, 양수 (0 + 4 = 4)
//		양수 , 양수 (6 * 4 = 24)

	}
}
