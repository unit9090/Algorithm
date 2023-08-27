class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 0;
        int length = 0;
        int[] values = new int[2];
        
        if(check(array)) {
            if(array.length <= 1) {
                answer = array[0];
            } else {
                for(int i = 0; i < array.length; i++) {
                    for(int j = 0; j < array.length; j++) {
                    	// 배열의 i 번째와 j번째가 같을 때 cnt++
                        if(array[i] == array[j]) {
                            cnt++;
                        }
                    }
                    
                    // 배열의 i번째 cnt가 2번 이상이면 중복값
                    if(cnt >= 2) {
                        if(values == null) {		// 배열이 처음 정의될 때
                        	values = new int[2];
                        	values[0] = cnt;
                        	values[1] = array[i];
							answer = array[i];
							// System.out.println("정의1: " + Arrays.toString(values));
						} else if(values[0] < cnt && values[1] != array[i]){ // 배열이 비어있지 않고, cnt가 더 클 때
							values[0] = cnt;
                        	values[1] = array[i];
                        	answer = array[i];
                        	// System.out.println("정의2: " + Arrays.toString(values));
						} else if(values[0] == cnt && values[1] != array[i]) { // cnt가 같고, 최빈값이 같을 때
							answer = -1;
							System.out.println(array[i] + ", " + values[1]);
							// System.out.println("정의3: " + Arrays.toString(values));
						}
                    } else if(cnt == 1) { // cnt가 1일 때 length++
                    	length++;
                    }
                    
//                    System.out.println("정의1: " + Arrays.toString(values));
                    cnt = 0;
                }
                
                if(length == array.length) {
                	answer = -1;
                }
            }            
        }
        
        return answer;
    }
    
    // 제한사항 확인
    public static boolean check(int[] array) {
        boolean check = false;
        boolean argu1 = (array.length > 0) && (array.length < 100);
        boolean argu2 = false;
        for(int x : array) {
            if(x >= 0 && x < 1000) {
            	argu2 = true;
            } else {
            	argu2 = false;
                break;
            }
        }
        
        if(argu1 && argu2) {
        	check = true;
        }
        
        return check;       
    }
}