class Solution {
    public static int solution(int balls, int share) {
        int answer = 1;
        double top = 1;
        double bottom = 1;
        int val = (balls - share) < share ? share : (balls - share);
        
        if(check(balls, share)) {
        	
        	for(int i = balls; i > val; i--) {
        		top *= i;
        		// System.out.println(top + " *= " + i);
        	}
        	
        	// System.out.println("--bottom--");
            
        	for(int j = 1; j <= balls - val; j++) {
        		bottom *= j;
        		// System.out.println(bottom + " *= " + j);
        	}
            
            // System.out.println("(" + top + ", " + bottom + ")");
            answer = (int)(top / bottom);
            if(answer < 0) {
            	answer = -answer;
            }
        }
        
        return answer;
    }
    
    public static boolean check(int balls, int share) {
        boolean check = false;
        boolean argu1 = balls >= 1 && balls <= 30;
        boolean argu2 = share >= 1 && share <= 30;
        boolean argu3 = share <= balls;
        
        if(argu1 && argu2 && argu3) {
            check = true;
        }
        
        return check;
    }
}