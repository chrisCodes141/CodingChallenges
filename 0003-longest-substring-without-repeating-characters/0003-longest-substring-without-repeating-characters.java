class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int stringLength = s.length();
    //     int lengthOfLongestSubstring  = 0;

    //     //i is left pointer, j is righter pointer
    //     for (int i = 0; i < stringLength; i++){

    //         HashSet set = new HashSet();

    //         //iterate starting from where left pointer is
    //         for (int j = i; j < stringLength; j++){

    //             //returns false if duplicate
    //             if(!set.add(s.charAt(j))) break;

    //             //if window larger, update
    //             lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, j - i + 1);
    //         }
    //     }
    //     return lengthOfLongestSubstring;
    // }

    int n = s.length(),left=0,right=0,maxLen=0;
      Set<Character> set = new HashSet<>();
      while(right<n)
      {
         while(set.contains(s.charAt(right)))
         {
            set.remove(s.charAt(left));
            left++;
         }
         set.add(s.charAt(right));
         maxLen = Math.max(maxLen,right-left+1);
         right++;
      }
     return maxLen;
    }
}