import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int oneSu = s.nextInt();
		int twoSu = s.nextInt();
		
		System.out.println(oneSu*(twoSu%10));
		System.out.println(oneSu*(twoSu%100/10));
		System.out.println(oneSu*(twoSu/100));
		System.out.println(oneSu*twoSu);
	}
}
