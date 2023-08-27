class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int ten = 1;
        int three = 1;
        for(int i = 1; i <= n; i++, three++) {
            // System.out.println((i % (ten * 10)) % 3);
            if((three % (ten * 10)) - 3 == 0 || three % 3 == 0) {
                three++;
                if(three % (ten * 10) - 3 == 0 || three % 3 == 0) {
                    three++;
                }
            }
            
            
            if((three - (three % 10)) / 10 > ten) {
                ten++;
                if(ten % 10 == 3) {
                    ten++;
                    three = ten * 10;
                }
            }
            
            System.out.println(i + ", " + three + ", " + ten);
        }
        
        answer = three - 1;
        return answer;
    }
}