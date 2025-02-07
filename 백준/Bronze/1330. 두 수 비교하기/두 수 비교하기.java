import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int left = Integer.parseInt(input[0]);
		int right = Integer.parseInt(input[1]);
		
		if(left > right) {
			System.out.println(">");
		} else if(left < right) {
			System.out.println("<");
		} else if(left == right) {
			System.out.println("==");
		}
		
		
	}
}
