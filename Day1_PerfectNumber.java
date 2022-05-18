package scalar;

import java.util.Scanner;

public class Day1_PerfectNumber {
	
	public static String isPerfect(int A) {
		int count = 0;
		for(int i = 1; i <= A/2; i++) {
			if(A % i == 0) {
				count += i;
			}
		}
		
		if(count == A) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {        
        try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int A = 0;
			for(int i = 0; i < N; i++) {
				A = in.nextInt();
				System.out.println(isPerfect(A));
			}
		}
	}
}
