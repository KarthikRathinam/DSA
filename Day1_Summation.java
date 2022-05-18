package scalar;

import java.util.Scanner;

public class Day1_Summation {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int result = N*(N+1)/2;
            System.out.println(result);
		}		
	}

}
