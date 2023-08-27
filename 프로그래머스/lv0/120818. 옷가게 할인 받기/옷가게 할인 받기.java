class Solution {
    public int solution(int price) {
        int answer = 0;
        double result = 0;
        if(check(price)) {
            if(price >= 100000 && price < 300000) {
                result = price * 0.95;
            } else if(price >= 300000 && price < 500000) {
                result = price * 0.9;
            } else if(price >= 500000) {
                result = price * 0.8;
            } else {
                result = price;
            }
        }
        answer = (int) result;
        return answer;
    }
    
    public static boolean check(int price) {
        boolean check = false;
        if(price % 10 == 0 && 10 <= price && price <= 1000000) {
            check = true;
        }
        return check;
    }
}