import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		int i = 1;
		while (i <= count) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());

			sb.append("Case #").append(i).append(": ").append(one + two).append("\n");
			i++;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}
}