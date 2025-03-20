import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=1; i <= count; i++) {			
			for(int k = 1; k <= count-i; k++) {
				sb.append(" ");
			}			
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}			
			sb.append("\n");
		}
		bw.write(sb.toString());		
		br.close();
		bw.close();
	}
}