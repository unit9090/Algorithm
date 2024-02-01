import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 1;
        String[] s = br.readLine().split("");
        for(int i = 0; i < s.length / 2; i++) {
            if(!s[i].equals(s[s.length - 1 - i])) {
                result = 0;
                System.out.println(result);
                break;
            }
        }
        
        if(result == 1) System.out.println(result);
        
    } 
}