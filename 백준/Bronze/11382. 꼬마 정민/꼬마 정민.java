import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		String su = s.nextLine().trim();
		
		String[] strBrr = su.split(" ");
		long total = 0;
		
		for(String str : strBrr) {
			total += Long.parseLong(str);
		}
		System.out.println(total);
		
	}
}
