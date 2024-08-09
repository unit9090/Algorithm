class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            for(int k = 0; k < index; k++) {
                ch++;
                if(ch > 'z') ch -= 26;
                // System.out.println(ch);
                
                while(true) {
                    if(skip.contains(Character.toString(ch))) {
                        ch++;
                        if(ch > 'z') ch -= 26;
                    } else {
                        break;
                    }
                }                
            }
            if(ch > 'z') ch -= 26;
            answer += ch;
        }        
        return answer;
    }
}