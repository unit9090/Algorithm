import java.util.Stack;
import java.util.Arrays;
import java.util.List;
/*
    스택(Stack):
        자료 구조 중 하나인 Stack의 사전적 정의는 '쌓다', '더미'이다.
        상자에 물건을 쌓아 올리듯이 데이터를 쌓는 자료 구조라고 할 수 있다.

        Stack의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는 (Last In First Out)의 형태를 띈다는 것이다.
        자바에서 Stack은 java.util.Stack을 import하면 바로 사용할 수 있다.

    Stack의 특징:
        1. 먼저 들어간 자료가 나중에 나옴 LIFO(Last In First Out) 구조
        2. 시스템 해킹에서 버퍼오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 함.
        3. 인터럽트처리, 수식의 계산, 서브루틴의 복귀 번지 저장 등에 쓰임.
        4. 그래프의 깊이 우선 탐색(DFS)에서 사용
        5. 재귀적(Recursion) 함수를 호출할 때 사용

    Stack의 메서드:
        1. 값 추가: push(val);
        2. 값 삭제: pop(); -> 마지막으로 들어간 값 제거
        3. 전체 값 제거: clear();
        4. 가장 상단의 값 출력: peek();
        5. 크기 출력: size();
        6. 비어있는지 확인: empty();
        7. val이 포함되어 있는지 확인: contains(val);
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
		
		// 문자열을 배열로 변환
		List<String> arr = Arrays.asList(s.split(""));
		
		// char형 스택 선언
		Stack<String> stack = new Stack<>();
		
		// stack에 문자를 저장하기 위해 문자열의 길이만큼 반복
		for(int i = 0; i < s.length(); i++) {
			if(stack.isEmpty()) {
				// stack이 비어있다면 비교할 문자가 없는 것이니 문자를 넣어줌.
				stack.add(arr.get(i));
			} else {
				// stack이 있다면 비교할 문자가 있으니 서로 비교
				if(stack.peek().equals(arr.get(i))) {
					stack.pop();
				} else {
					stack.add(arr.get(i));
				}
			}
		}		
		// System.out.println(stack);		
		if(stack.isEmpty()) answer = 1;		
		
		return answer;
    }
    
    // 실패 사유: 오래 걸림.
//     public int max(String s) {
//         int answer = 0;
		
// 		for(char c = 'a'; c <= 'z'; c++) {
//             String x = c + "" + (c + "");
//             // System.out.println(x);
//             if(s.contains(x)) {
//                 // System.out.println(s.replaceAll(x, ""));
//                 s = s.replaceAll(x, "");
//                 c = (char) 'a' - 1;
//             }            
            
//             if(s.length() == 0) {
//                 answer = 1;
//             }
//         }	

//         return answer;
//     }
}