class Solution {
    public String solution(String code) {
        //String ret = "";
        Boolean mode = false;
        
//         for(int i = 0; i < code.length(); i++) {
//             char ch = code.charAt(i);
            
//             if(mode) {
//                 if(ch != '1' && i % 2 != 0) ret += ch;
//                 else if(ch == '1') mode = false;
//             } else {
//                 if(ch != '1' && i % 2 == 0) ret += ch;
//                 else if(ch == '1') mode = true;
//             }
//         }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            
            if((mode && i % 2 != 0) || (!mode && i % 2 == 0))
                sb.append(code.charAt(i));   
        }
        
        //if(ret.equals("")) ret = "EMPTY";
        if(sb.length() <= 0) sb.append("EMPTY");
        
        return sb.toString();
    }
}