import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");    // 기존 문자열 배열에 추가
        String bomb = br.readLine();    // 폭탄 문자
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            
            if(sb.length() >= bomb.length()) {
                if(sb.substring(sb.length() - bomb.length(), sb.length()).equals(bomb)) {
                    sb.delete(sb.length() - bomb.length(), sb.length()); 
                }
            }
        }
        System.out.println(sb.length() > 0 ? sb : "FRULA");
    }
}
