import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);;
		int first = s.nextInt();
		int second = s.nextInt();
		int third = s.nextInt();
		
		System.out.println((first+second)%third);
		System.out.println(((first%third)+(second%third))%third);
		System.out.println((first*second)%third);
		System.out.println(((first%third)*(second%third))%third);
		
	}
}
