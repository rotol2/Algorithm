import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int su = Integer.parseInt(br.readLine());

		int total = 0;
		int i = 0;

		for (String s : num) {
			int n = Integer.parseInt(s);
			if(n == su) {
				total += 1;
			} 
			i++;
		}
		if(total > 0) {
			System.out.println(total);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}