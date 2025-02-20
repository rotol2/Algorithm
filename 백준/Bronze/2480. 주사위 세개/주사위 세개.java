import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);	
		String[] input = sc.nextLine().split(" ");
		
		int[] dice = new int[input.length];
		
		for(int i = 0; i < input.length; i++) {
			dice[i] = Integer.parseInt(input[i]); 
		}
		
		if(dice[0] == dice[1] && dice[1] == dice[2]) {
			System.out.println(10000 + dice[0] * 1000);
		} else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[0]) {
			if(dice[0] == dice[1] || dice[0] == dice[2]) {
				System.out.println(1000 + dice[0] * 100);
			} else {
				System.out.println(1000 + dice[1] * 100);
			}
		} else {
			int max = 0;
			for(int num : dice) {
				max = Math.max(max, num);
			}
			System.out.println(max*100);
		}
		
	}
}