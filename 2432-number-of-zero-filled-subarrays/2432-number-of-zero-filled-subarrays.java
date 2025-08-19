class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum =0;
        long ans_sum = 0;
        for(int num : nums){
            if(num==0){
                sum++;
            }
            else{
                sum = 0;
            }
            ans_sum = ans_sum + sum;
        }
        return ans_sum;

    }
}