package n220805;

import java.util.Scanner;

public class n2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			for (int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
