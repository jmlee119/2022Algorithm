package n220831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n25304 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int total = Integer.parseInt(br.readLine());
	    int count = Integer.parseInt(br.readLine());
	    int[] n1=new int[count];
	    int[] n2=new int[count];
	    int sum=0;
	    for(int i=0; i<count; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	n1[i] = Integer.parseInt(st.nextToken());
	    	n2[i] = Integer.parseInt(st.nextToken());
	    	sum =sum +  n1[i]*n2[i];
	    }

	    if(sum==total) {
	    	System.out.println("Yes");
	    }
	    else {
	    	System.out.println("No");
	    }
	    
	}

}
