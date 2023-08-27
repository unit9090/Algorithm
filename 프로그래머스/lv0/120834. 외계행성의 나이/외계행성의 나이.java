class Solution {
    public String solution(int age) {
        String answer = "";
        
        // 알파벳 index 값을 알기위한 문자열
        String str = "abcdefghijklmnopqrstuvwxyz";
        // 나이를 String 타입으로 변환.
        String obj = String.valueOf(age);
        
        if(check(age)) {
            for(int i = 0; i < obj.length(); i++) {
                // val: age의 한자리를 int로 변환
                int val = Integer.parseInt(obj.substring(i, i + 1));
                // compare: age의 한자리를 int로 변환한 값을 인덱스로 갖는 소문자 찾음.
                String compare = str.substring(val, val + 1);
                System.out.println(val);
                System.out.println(compare);

                // 리턴값에 소문자를 저장
                answer += compare;
            }
        }
        
        
        
        return answer;
    }
    
    public boolean check(int age) {
        boolean check = false;
        if(age <= 1000) {
            check = true;
        }
        return check;
    }
}