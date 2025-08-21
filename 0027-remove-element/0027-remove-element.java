class Solution {
     public void swap(int arr[],int a,int b){
         int temp = arr[a]; 
        arr[a] = arr[b];  
        arr[b] = temp;
    } 
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) c++;
        }
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=val){
                swap(nums,i,j);
                j++;
            }
        }
    
    return nums.length-c;
   
}}