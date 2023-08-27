import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int now = -1;   // 틀린 사람 순서
        int count = 0;  // 틀린 사람 차례
        char c = '\0';  // 전 끝 문자
        ArrayList<String> list = new ArrayList<>();        
        
        for(int i = 0; i < words.length; i++) {            
            // 차례
            if(i % n == 0) count++;
            
            // 끝말잇기에 사용한 단어가 있을 시
            if(list.contains(words[i])) {
                // System.out.println("??");
                now = (i + 1) % n == 0 ? n : (i + 1) % n;
                break;
            }
            
            // 첫 문자와 전 문자 끝 단어가 같은지 확인
            if(i != 0 && c != words[i].charAt(0)) {
                // System.out.println("!!");
                now = (i + 1) % n == 0 ? n : (i + 1) % n;
                break;
            }
            
            list.add(words[i]);
            c = words[i].charAt(words[i].length() - 1);
        }
        
        // 틀린 사람이 없을 시
        if(now == -1) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = now;
            answer[1] = count;
        }
        
        return answer;
    }
}