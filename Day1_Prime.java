package scalar;

import java.util.Scanner;

public class Day1_Prime {

	public static void main(String[] args) {        
        try (Scanner in = new Scanner(System.in)) {
        	System.out.println("Enter a number:");
			int N = in.nextInt();
			int count = 0;

			for(int i = 1; i * i <= N; i++) {
			    if(N % i == 0) {
			        if(i * i == N) {
			            count++;
			        }
			        else {
			            count += 2;
			        }                
			    }
			}
			
			if(count == 2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
