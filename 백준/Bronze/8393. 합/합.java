import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int total = 0;
		int i = 1;
		while(i <= n) {
			total += i;
			i++;
		}
		System.out.println(total);
	}
}