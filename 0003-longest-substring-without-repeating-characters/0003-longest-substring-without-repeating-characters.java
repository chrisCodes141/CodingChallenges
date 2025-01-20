class Solution {
    public int lengthOfLongestSubstring(String s) {       int stringLength = s.length();
        int lengthOfLongestSubstring  = 0;

        //i is left pointer, j is righter pointer
        for (int i = 0; i < stringLength; i++){

            HashSet set = new HashSet();

            //iterate starting from where left pointer is
            for (int j = i; j < stringLength; j++){

                //returns false if duplicate
                if(!set.add(s.charAt(j))) break;

                //if window larger, update
                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, j - i + 1);
            }
        }
        return lengthOfLongestSubstring;
    }
}