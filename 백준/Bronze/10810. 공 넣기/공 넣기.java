import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		int[] ball = new int[size];
		int i = 0;
		int k;
		
		while(i < count) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			for(k = first; k <= end; k++) {				
				ball[k-1] = num;
			}
			i++;
		}
	
		for(k = 0; k < ball.length; k++) {
			sb.append(ball[k]);
			if(k < ball.length - 1) {
				sb.append(" ");
			}
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}