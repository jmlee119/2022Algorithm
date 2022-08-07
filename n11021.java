package n220805;

import java.util.Scanner;

public class n11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}
