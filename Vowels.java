package scalar;

import java.util.Arrays;

public class Vowels {

	public static void main(String[] args) {
		int A[] = {5,5,5,5,5,5};
		System.out.println(solve(A));

	}
	
    public static int solve(int[] A) {
    	Arrays.sort(A);
        int p = 0;
        int q = 0;
        int len = A.length;
        int max = 0;

        for(int i = len - 1; i > 0; i--) {
            if(A[len - 1] != A[len - 2]) {
                p = A[len - 1];
                q = A[len - 2];
                max = q % p;
                break;
            }
            else {
                len -= 1;
            }
        }

        return max;
    }
}