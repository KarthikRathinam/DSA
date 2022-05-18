package scalar;

import java.util.Scanner;

public class Day1_Armstrongnumber {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int origNumber = 0;		
			int remainder = 0;
			int result = 0;
			
			for(int i = 1 ; i < N; i++) {
				origNumber = i;
				remainder = 0;
				result = 0;
				
				while(origNumber != 0) {
					remainder = origNumber % 10;
					result += (int)Math.pow(remainder, 3);
					origNumber /= 10;
				}
				
				if (result == i) {
					System.out.println(i);
				}
			}
		}
	}

}
