package n220831;

import java.util.Scanner;

public class n10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		int[] n = new int[a];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a; i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0; i<a; i++) {
			if (max<n[i]) {
				max = n[i];
			}
			if (min>n[i]) {
				min = n[i];
			}
		}
		System.out.println(min + " "+max);
	
	}
}
