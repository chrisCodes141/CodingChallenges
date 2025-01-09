class Solution {
public static void merge(int[] nums1, int m, int[] nums2, int n){
        //points to first number from back
        int nums1Ptr = m - 1;
        int nums2Ptr = n - 1;

        //points to end of nums1 list where sorted #s will be placed
        int nums1Placer = m + n - 1;

        //as long as numbers from 2nd list can be placed, the rest of list 1 will be sorted
        while(nums2Ptr >= 0)
        {
            //if number in nums1 greater, place at end of nums1 
            //(if nums1Ptr runs out first, and nums stil left in nums2, else will keep placing it slist to nums1)
            if(nums1Ptr >= 0 && nums1[nums1Ptr] > nums2[nums2Ptr]) {
                nums1[nums1Placer--] = nums1[nums1Ptr--];
            }
            // nums2 was bigger, place in next spot
            else {
                nums1[nums1Placer--] = nums2[nums2Ptr--];
            }
        }
    }
}