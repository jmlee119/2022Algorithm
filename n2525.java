package n220808;

import java.util.Scanner;

public class n2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int h= sc.nextInt();
		int m= sc.nextInt();
		int m2= sc.nextInt();
		
		int a = h*60 +m+m2;
		h = a/60;
		m = a%60;
		
		if (h >=24) {
			h = h-24;
		}
		System.out.println(h+ " "+m);
	}

}
