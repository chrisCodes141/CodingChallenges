class Solution {
    public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> hMap = new HashMap();

            int complementDiff = 0;

            for(int i = 0; i < nums.length; i++){
                complementDiff = target - nums[i];
                if(hMap.containsKey(complementDiff)){
                    return new int[] { i, hMap.get(complementDiff)};
                }
                hMap.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
    }
}