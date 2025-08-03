import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                al.add(nums1[i]);
                i++;
            } else {
                al.add(nums2[j]);
                j++;
            }
        }

        while (i < m) {
            al.add(nums1[i]);
            i++;
        }

        while (j < n) {
            al.add(nums2[j]);
            j++;
        }
        for (int k = 0; k < al.size(); k++) {
            nums1[k] = al.get(k);
        }
    }
}
