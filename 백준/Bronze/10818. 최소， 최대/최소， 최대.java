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
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		int[] array = new int[count];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < count; i++) {	
			array[i] = Integer.parseInt(st.nextToken());
			if(max < array[i]) max = array[i];
			if(min > array[i]) min = array[i];
		}
		sb.append(min).append(" ").append(max);
		
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}