import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x : numlist) {
            int minus = n <= x ? x - n : n - x;
            arr.add(minus);
        }
        
        // System.out.println(arr);
        
        for(int i = 0; i < numlist.length; i++) {
            int count = 0;
            for(int j = 0; j < numlist.length; j++) {
                // System.out.println(arr.get(i) + ", " + arr.get(j));
                if(i != j) {                    
                    if(arr.get(i) > arr.get(j)) {
                        count++;
                    }
                    
                    // System.out.println(arr.get(i) + ", " + arr.get(j));
                    if(arr.get(i).equals(arr.get(j)) && numlist[i] < numlist[j]) {
                        // numlist[i] < numlist[j]
                        // System.out.println(numlist[i] + ", " + numlist[j]);
                        count++;                 
                    }
                }
            }
            // System.out.println("i:" + i + ", index : " + count + ", value: " + numlist[i]);
            answer[count] = numlist[i];
        }
        
        return answer;
    }
}