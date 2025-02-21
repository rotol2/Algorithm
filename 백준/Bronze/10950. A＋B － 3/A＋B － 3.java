import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		int i = 0;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int A;
		int B;

		while (i < count) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			sb.append(A + B).append("\n");
			i++;
		}
		System.out.println(sb);

	}
}