package scalar;

public class BinaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("00100000100101111111"));

	}
	
    public static int solve(String A) {
        int res = 100;
        int count = 0;        
        
        if(A.charAt(0) == '0') {
             res = 1;
        }
        else {
            res = -1;
        }
        
        System.out.println("inter 1: " + res);
        
        for(int i = 1; i < A.length(); i++) {
        	            
            
            if(A.charAt(i) == '0') {
                res += 1;
            }
            else {
                res += -1;
            }

            System.out.println("inter 2: " + res);
            
            if(res == 0) {
                count++;
                System.out.println("Count: " + count);
            }
        }
		return count;

    }

}
