class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = board[0] / 2;
        int heigt = board[1] / 2;
        
        for(String s : keyinput) {
            switch(s) {
                case "up":
                    if(answer[1] >= heigt) {
                        break;
                    }
                    answer[1] += 1;
                    break;
                case "down":
                    if(answer[1] <= -heigt) {
                        break;
                    }
                    answer[1] -=1;
                    break;
                case "left":
                    if(answer[0] <= -width) {
                        break;
                    }
                    answer[0] -= 1;
                    break;
                case "right":
                    if(answer[0] >= width) {
                        break;
                    }
                    answer[0] += 1;
            }
        }
        
        
        return answer;
    }
}