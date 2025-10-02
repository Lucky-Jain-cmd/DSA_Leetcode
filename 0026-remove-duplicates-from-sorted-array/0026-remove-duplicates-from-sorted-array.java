class Solution {
    public int removeDuplicates(int[] nums) {
      int uni_idx =0;
      for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[uni_idx]){
            uni_idx++;
            nums[uni_idx]=nums[i];
        }
      }
        return uni_idx+1;
    }
}