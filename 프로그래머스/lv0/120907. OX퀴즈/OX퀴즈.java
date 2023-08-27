class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int sum = 0;
            
            if(quiz[i].contains("+")) {
                sum = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            } else {
                sum = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }
            
            // System.out.println(sum);
            
            if(sum == Integer.parseInt(str[str.length - 1])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}