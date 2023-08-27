class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        
        if(check(num_list, n)) {
            int column = num_list.length / n;
            answer = new int[column][n];
            
            int count = 0;
            for(int i = 0; i < column; i++) {
                for(int j = 0; j < n; j++) {
                    answer[i][j] = num_list[count];
                    count++;
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] list, int n) {
        boolean check = false;
        boolean argu1 = (list.length % n == 0);
        boolean argu2 = list.length >= 0 && list.length <= 150;
        boolean argu3 = n >= 2 && n < list.length;

        if(argu1 && argu2 && argu3) {
            check = true;
        }
        
        return check;
    }
}