package blind75.ArraysNhashing;

import org.codehaus.groovy.runtime.powerassert.SourceText;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

 */

// Complexity

//     Time complexity: O(m+n)

//     We are iterating through both arrays once, so the time complexity is O(m+n).

//     Space complexity: O(1)

//     We are not using any extra space, so the space complexity is O(1).


public class MergeSortedArrays{

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
        //Prove the solution worked
        for(int i = 0; i < nums1.length; i++)
        {
            System.out.println(nums1[i]);
        }
    }
}