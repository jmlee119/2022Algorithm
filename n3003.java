package n220831;

import java.util.Scanner;

public class n3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n1 = new int[6];
		int[] full = new int[]{1,1,2,2,2,8};
		int[] n2 = new int[6];
		for (int i=0; i<n2.length; i++) {
			n2[i]=sc.nextInt();
		}
		
		for (int i=0; i<full.length; i++) {
			n1[i] = full[i] - n2[i];
			System.out.print(n1[i]+" ");
		}
	}
}
