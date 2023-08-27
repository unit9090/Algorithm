class Solution {
    public int solution(String[] babbling) {
        int answer = 0;        
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(String bab : babbling) {
            String re = bab;
            
            strArr: for(String s : str) {                
                // 연속된 발음이 있을 경우.
                if(bab.contains(s + s)) {
                    // System.out.println("delete: " + re);
                    break strArr;
                }
                
                // 해당 발음 지우기
                re = re.replaceAll(s, " ");
                // System.out.println(s + " : " + re);
            }
            
            re = re.replaceAll(" ", "");
            // re의 길이가 0 일 경우 answer++
            if(re.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}