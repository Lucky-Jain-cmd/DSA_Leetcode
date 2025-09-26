class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=m;
        // for(int j=0;j<n;j++,i++){
        //     nums1[i]=nums2[j];
        // }
        // Arrays.sort(nums1);
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                al.add(nums1[i]);
                i++;
            }
            else{
                al.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            al.add(nums1[i]);
            i++;
        }
        while(j<n){
            al.add(nums2[j]);
            j++;
        }
        int k=al.size();
        for(int p=0;p<k;p++){
            nums1[p]=al.get(p);
        }

    }
}