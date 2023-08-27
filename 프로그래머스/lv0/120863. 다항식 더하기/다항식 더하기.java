class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] poly = polynomial.split(" ");
        
        int x = 0;
        int y = 0;
        for(String s : poly) {
            if(s.contains("x")) {
                if(s.length() > 1) {
                    String sid = s.substring(0, s.indexOf("x"));
                    x += Integer.parseInt(sid);
                } else {
                    x += 1;
                }
            } else if(!s.equals("+")){
                y += Integer.parseInt(s);
            }
        }
        
        if(x == 1) {
            answer = "x + ";
        } else if(x == 0) {
            answer = "";
        } else {
            answer = Integer.toString(x) + "x + ";
        }
        
        if(y == 0) {
            answer = answer.replaceAll("[ + ]", "");
        } else {
            answer += Integer.toString(y);
        }
        
        return answer;
    }
}