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
		
		int max = Integer.MIN_VALUE;
		
		int count = 0;
		int i = 1;
		while(true) {
			String test = br.readLine();
			if(test == null) {
				break;
			}
			int num = Integer.parseInt(test);
			if(max < num) {				
				max = num;
				count = i;
			}
			i++;
		}
		sb.append(max).append("\n").append(count);
		
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}