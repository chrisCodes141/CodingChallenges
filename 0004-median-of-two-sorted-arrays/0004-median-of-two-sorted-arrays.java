class Solution {
  
    private static int[] mergeArrays(int[] nums1, int[] nums2){
        int[] mergedArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);

        return mergedArr;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] mergedArr = mergeArrays(nums1, nums2);

        int mergedArrLength = mergedArr.length;

        Arrays.sort(mergedArr);

        if(mergedArr.length % 2 == 0){
            System.out.println(mergedArr[mergedArrLength/2 - 1] + " and " + mergedArr[mergedArrLength/2]);
            return  (double) (mergedArr[mergedArrLength/2 - 1] + mergedArr[mergedArrLength/2]) / 2;
        }

        return mergedArr[(int)Math.floor(mergedArrLength/2)];
    }
        
}