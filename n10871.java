import java.util.Scanner;

public class n10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] n = new int[a];
		
		for (int i=0; i<a; i++) {
			n[i] = sc.nextInt();
			if (n[i]<b) {
				System.out.println(n[i]);
			}
		}
	}
}
