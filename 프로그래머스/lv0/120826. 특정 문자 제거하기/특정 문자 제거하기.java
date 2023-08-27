class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // 문자열_변수.substring(시작 index, (끝 index)); => 문자열의 시작 index에서 끝 index까지 추출
        // 문자열_변수.indexOf(문자열1) => 문자열 중에 문자열1이 들어가 있는 index를 추출
        String result = "";
        
        if(check(my_string, letter)) {
            for(int i = 0; i < my_string.length(); i++) {
                if(!my_string.substring(i, i + 1).equals(letter)) {
                    // System.out.println("안똑같아!");
                    result = my_string.substring(i, i + 1);
                    // System.out.println(result);      
                    answer += result;
                }
            }
        }        
        
        return answer;
    }
    
    public boolean check(String my_str, String lett) {
        boolean check = false;
        boolean argu1 = (1 <= my_str.length()) && (my_str.length() <= 100);
        boolean argu2 = lett.length() == 1;
        
        if(argu1 && argu2) {
            check = true;
        }
        
        return check;
    }
}