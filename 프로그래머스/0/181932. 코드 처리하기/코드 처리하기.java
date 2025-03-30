class Solution {
    public String solution(String code) {
        String ret = "";
        Boolean mode = false;
        
        for(int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            
            if(mode) {
                if(ch != '1' && i % 2 != 0) ret += ch;
                else if(ch == '1') mode = false;
            } else {
                if(ch != '1' && i % 2 == 0) ret += ch;
                else if(ch == '1') mode = true;
            }
        }
        
        if(ret.equals("")) ret = "EMPTY";
        
        return ret;
    }
}