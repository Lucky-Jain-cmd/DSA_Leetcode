class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<n;i++){
        
        int index_visited = Math.abs(nums[i])-1;
        if(nums[index_visited]>0)
        nums[index_visited]=-nums[index_visited];
    }
    for(int i=0;i<n;i++){
        if(nums[i]>0){
            al.add(i+1);
        }
    }
    return al;
    }
}