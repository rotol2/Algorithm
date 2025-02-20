import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int startHour = Integer.parseInt(st.nextToken());
		int startMinute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());

		int finishMinute = startMinute + time;
		int count = finishMinute / 60;
		
		if (finishMinute >= 60) {
			startHour = startHour + count;
			if(startHour > 23) {
				startHour = startHour -24;
			}
			finishMinute = finishMinute - 60 * count;
		}
		System.out.println(startHour + " " + finishMinute);
		
	}
}
