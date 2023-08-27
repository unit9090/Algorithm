class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] sum = new double[score.length];
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                sum[i] += score[i][j];
            }
            sum[i] = sum[i] / 2.0;
        }
        
        for(int i = 0; i < sum.length; i++) {
            answer[i] = 1;
            for(int j = 0; j < sum.length; j++) {
                if(sum[i] < sum[j]) answer[i]++;
            }
        }
        
        
        return answer;
    }
}