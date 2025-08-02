class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       if(n==0) return 0;
       Arrays.sort(nums);
       int last_smaller = Integer.MIN_VALUE;
       int count=0;
       int longest=1;
       for(int i=0;i<n;i++){
        if(nums[i]-1==last_smaller){
            count++;
            last_smaller=nums[i];
        }
        else if(nums[i]!=last_smaller){
            count=1;
            last_smaller=nums[i];
        }
         longest = Math.max(longest,count);
       } 
      return longest;
    }
}