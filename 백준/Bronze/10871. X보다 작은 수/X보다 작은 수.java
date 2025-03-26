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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] aArray = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			aArray[i] += Integer.parseInt(st.nextToken());
			if(aArray[i] < x) {
				sb.append(aArray[i]).append(" ");
			}
		}
		
		if (sb.length() > 0) {
		    sb.setLength(sb.length() - 1);
		}
		
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}