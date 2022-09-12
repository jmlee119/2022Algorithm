import java.util.Scanner;

public class n2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] n = new int[9];
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0; i<9; i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0; i<9; i++) {
			if (max<n[i]) {
				max = n[i];
				count =i+1;
			}
		}	
		System.out.println(max);
		System.out.println(count);
	}
}