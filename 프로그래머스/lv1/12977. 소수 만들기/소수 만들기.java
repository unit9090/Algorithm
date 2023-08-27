class Solution {
    public int solution(int[] nums) {
        int answer = -1;

        int result = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                    
                    int count = 0;
                    for(int l = 1; l <= sum; l++) {
                        if(sum % l == 0) {
                            count++;
                            // System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);                            
                            if(count > 2) {
                                break;
                            }
                        }
                    }
                    
                    if(count == 2) {
                        result++;
                        // System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                        // System.out.println(sum);
                    }
                }
            }
        }
        
        // System.out.println(result);
        answer = result;

        return answer;
    }
}