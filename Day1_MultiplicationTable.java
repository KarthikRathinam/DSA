package scalar;

import java.util.Scanner;

public class Day1_MultiplicationTable {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			
			for(int i = 1 ; i <= 10; i++) {
				System.out.println(N + " * " + i + " = " + N * i);
			}
		}
	}

}
