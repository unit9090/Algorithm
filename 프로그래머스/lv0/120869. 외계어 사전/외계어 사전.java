class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        
        for(String d : dic) {
            count = 0;
            for(String s : spell) {
                if(d.contains(s)) {
                    count++;
                    System.out.println(d);
                }
            }
            
            if(count == spell.length) {
                answer = 1;
                break;
            }
        }
        
        
//         for(int i = 0; i < spell.length; i++) {
//             count = 0;
//             for(int j = 0; j < dic.length; j++) {
//                 if(dic[j].contains(spell[i])) {
//                     count++;
//                     System.out.println(dic[j]);
//                 }
//             }
            
//             if(count == spell.length) {
//                 answer = 1;
//                 System.out.println("멈춰");
//                 break;
//             }
//         }
        
        return answer;
    }
}