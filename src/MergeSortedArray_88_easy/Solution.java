package MergeSortedArray_88_easy;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0){
            System.arraycopy(nums2,0, nums1, 0, m + n);
            return;
        }

        int endIndex = m + n - 1;
        while(n > 0 && m >= 0){
            if((nums1[m - 1] >= nums2[n - 1]) || m == 0){
                nums1[endIndex] = nums1[m - 1];
                m--;
            } else {
                nums1[endIndex] = nums2[n - 1];
                n--;
            }
            endIndex--;
        }
    }
}
