import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        // 약관의 유효기간(terms): "약관_종류 (공백) 유효기간"
        Map<String, Integer> termMap = new HashMap<>();
        for(String s : terms) {
            String[] x = s.split(" ");
            int y = Integer.parseInt(x[1]);
            termMap.put(x[0], y);
        }
        // System.out.println("termMap: " + termMap);
        
        // 오늘 날짜
        int toDay = Integer.parseInt(today.replace(".", ""));
        for(int i = 0; i < privacies.length; i++) {
            String pri = privacies[i];
            int date = Integer.parseInt(pri.split(" ")[0].replace(".", ""));
            String type = pri.split(" ")[1];
            
            int year = date / 10000;
            int month = (date % 10000) / 100;
            int day = date % 100;

            month += termMap.get(type);
            day -= 1;
            
            // day가 0이면 말일로 변경
            if(day == 0) {
                month -= 1;
                day = 28;
            }
            
            // month가 12보다 크면
            if(month > 12) {
                year += month / 12;
                month -= 12 * (month / 12);                
            }
            
            // month가 0이 되면
            if(month == 0) {
                month = 12;
                year -= 1;
            }
            
            date = year * 10000 + month * 100 + day;
            
            // 수집일자에 유효기간을 더한 날짜보다 오늘 날짜가 크면 => 파기
            if(date < toDay) {
                answerList.add(i + 1);
            } 
        }
        
        // System.out.println(answerList);
        answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}