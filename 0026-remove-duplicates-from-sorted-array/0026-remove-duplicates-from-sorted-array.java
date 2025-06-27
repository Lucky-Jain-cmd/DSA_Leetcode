class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            ts.add(nums[i]);
        }
        int n = ts.size();
        int i=0;
        for(int num : ts){
            nums[i++] = num;
        }
        return i;
        
    }
}