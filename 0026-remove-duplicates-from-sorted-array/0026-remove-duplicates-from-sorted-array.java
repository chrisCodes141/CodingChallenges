class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int distinctCount = 1;
        int slowPTR = 0;

        for (int fastPTR = 1; fastPTR < nums.length; fastPTR++) {
            //when num at fastPTR doesn't match num at slowPtr, make that number the next distinct num
            if (nums[fastPTR] != nums[slowPTR]) {
               slowPTR++; // Move slow pointer to the next position
               nums[slowPTR] = nums[fastPTR]; // Update the distinct element at slowPTR
               distinctCount++; // Increment the distinct count
            }
        }
        return distinctCount;
    }
}


//for loop iterating over entire array, extra condition if fastPTR reaches end then break
// fastPTR iterates over numbers  until new one found, current number updated
// slow ptr updates next value to the one it was found, increment distinct count