class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        // 붕대감기 t초동안 1초마다 x만큼의 체력 회복
        // t초 연속으로 붕대를 감는데 성공 = y만큼의 체력을 추가로 회복
        // 최대 체력보다 커지는 것은 불가능
        
        // 붕대 감는 중 공격 => 기술 취소, 회복 불가
        // 다시 붕대 감으면 연속 시간은 0초
        
        // 몬스터 공격 시 체력 줄어듬, 현재 체력이 0 이하면 캐리터 죽음
        // bandage = [1초 회목량, 추가 회복량]
        // health = 최대 체력
        // attacks = [[공격 시간, 피해량]]
        
        int seqheal = 0;    // 연속 성공
        int nowHealth = health;
        int attack = 0;     // 공격
        int lastAttack = attacks[attacks.length - 1][0];        // 마지막 공격
        int healTime = bandage[0];  // 시전 시간
        int heal = bandage[1];  // 초당 회복량
        int addHeal = bandage[2];   // 추가 회복량
        
        for (int i = 0; i <= lastAttack; i++) {            
            if(attacks[attack][0] == i) {       // 현재 초와 몬스터 공격 시간이 같은 경우
                seqheal = 0;        // 연속 힐 초기화
                nowHealth -= attacks[attack][1];    // 현재 체력에서 피해량 감소
                attack++;
            } else {        // 공격 받지 않는 경우
                nowHealth += heal;
                seqheal++;
                
                if(seqheal == healTime) {   // 연속 힐과 회복 시간이 같으면 추가 힐
                    seqheal = 0;
                    nowHealth += addHeal;
                }
                
                if(nowHealth > health) {    // 현재 체력이 최대 체력보다 큰 경우
                    nowHealth = health;
                }
            }
            
            if(nowHealth <= 0) {    // 현재 캐릭터 체력이 0 이하인 경우
                answer = -1;
                break;      // 0인 경우, 바로 마무리
            } else {
                answer = nowHealth;
            }
            
            // System.out.println(i + "초 = " + nowHealth + ", 연속 = " + seqheal + ", 공격 = " + attacks[attack][0]);
        }
        
        return answer;
    }
}