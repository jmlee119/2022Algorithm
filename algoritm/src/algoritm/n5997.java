package algoritm;

import java.util.Scanner;

public class n5997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num =new int[31];
		for (int i=1; i<29; i++) {
			int a = sc.nextInt();
			num[a]=1;
		}
		for (int i=1; i<num.length; i++) {
			if(num[i]!=1) System.out.println(i);
		}
	}

}
