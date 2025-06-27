class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int nn = 0;
       for(int i=0;i<nums.length;i++){
         hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        if(entry.getValue()==1)
          nn =entry.getKey();
         
       }
       return nn;
}}