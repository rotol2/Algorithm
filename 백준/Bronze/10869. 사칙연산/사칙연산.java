import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int one = s.nextInt();
		int two = s.nextInt();
		
		System.out.println(one+two);
		System.out.println(one-two);
		System.out.println(one*two);
		System.out.println(one/two);
		System.out.println(one%two);
	}
}