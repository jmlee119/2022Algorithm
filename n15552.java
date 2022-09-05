import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int a,b;
	    for (int i=0; i<num; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	a = Integer.parseInt(st.nextToken());
	    	b = Integer.parseInt(st.nextToken());
	    	
	    	bw.write((a+b)+"\n");
	    }
	    br.close();
	    bw.flush();
	    bw.close();

	}

}
