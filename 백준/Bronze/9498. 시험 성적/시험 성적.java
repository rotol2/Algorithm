import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		
		if(90 <= test && 100 >= test) {
			System.out.println("A");
		} else if(80 <= test && 89 >= test) {
			System.out.println("B");
		} else if(70 <= test && 79 >= test) {
			System.out.println("C");
		} else if(60 <= test && 69 >= test){
			System.out.println("D");
		} else {			
			System.out.println("F");
		}
		
	}
}