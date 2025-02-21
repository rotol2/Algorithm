import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalSum = Integer.parseInt(br.readLine());
		int totalCount = Integer.parseInt(br.readLine());
		
		int total = 0;
		int i = 1;
		while(i <= totalCount) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			total += sum * count;
			i++;
		}
		System.out.println((total == totalSum) ? "Yes" : "No");
		
	}
}
