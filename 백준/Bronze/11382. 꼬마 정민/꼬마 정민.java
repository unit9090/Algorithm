import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        
        long sum = 0;
        for(int i = 0; i < strs.length; i++) {
            long x = Long.parseLong(strs[i]);
            sum += x;
        }
        
        System.out.println(sum);
    }
}