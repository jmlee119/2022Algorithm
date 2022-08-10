package n220808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2884 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int hour = Integer.parseInt(st.nextToken());
	    int minute = Integer.parseInt(br.readLine());
	    int m = Integer.parseInt(br.readLine());
	    if (minute <45) {
	    	hour --;
	    	minute = 60 - (45-minute);
	    	if (hour <=0) {
	    		hour =23;
	    	}
	    	System.out.println(hour + " "+minute);
	    }
	    else {
	    	System.out.println(hour +" "+(minute-45));
	    }
	}

}
