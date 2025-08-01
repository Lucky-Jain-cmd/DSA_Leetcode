class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int countCheck=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                countCheck++;
            }
        }
        return countCheck>(nums.length/2)?ele:-1;
    }
}