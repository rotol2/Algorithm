import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int oneSu = s.nextInt();
		int twoSu = s.nextInt();
		
		int total;
		int first = twoSu / 100;
		total = twoSu % 100;
		int second = total / 10;
		total = twoSu % 10;
		int third = total;
		
		System.out.println(oneSu*third);
		System.out.println(oneSu*second);
		System.out.println(oneSu*first);
		System.out.println(oneSu*twoSu);
	}
}