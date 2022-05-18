package scalar;

import java.util.Scanner;

public class Day1_Squareroot { 

    public static void main(String[] args)
    {
    	
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int res = (int) Math.sqrt(N);
			if(res * res == N) {
				System.out.println(res);
			}
			else System.out.println(-1);
		}        
    }

}