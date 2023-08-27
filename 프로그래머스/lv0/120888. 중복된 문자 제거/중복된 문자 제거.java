import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        String[] resultArr = Arrays.stream(str).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(resultArr));
        for(String s : resultArr) {
            answer += s;
        }
        return answer;
    }
}