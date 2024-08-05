package MergeSortedArray_88_easy;

import AddTwoNumbers_2_medium.ListNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        solution.merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
}
