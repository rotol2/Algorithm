import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int one = Integer.parseInt(st.nextToken());
		int two = Integer.parseInt(st.nextToken());
		int three =  Integer.parseInt(st.nextToken());
		
		if(one == two && two == three) {
			System.out.println(10000 + one * 1000);
		} else if(one == two || two == three || three == one) {
			System.out.println(1000 + ((one == two || one == three) ? one : two) * 100);
		} else {
			System.out.println(Math.max(one, Math.max(two, three)) * 100);
		}
		
	}
}