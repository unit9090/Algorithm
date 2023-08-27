import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        List<String> id = new ArrayList<>();
        for(int i = 0; i < db.length; i++) {
            id.add(db[i][0]);
        }
        
        for(int i = 0; i < db.length; i++) {
            if(id.contains(id_pw[0])) {
                if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            } else {
                answer = "fail";
                break;
            }
        }        
        
        return answer;
    }
}