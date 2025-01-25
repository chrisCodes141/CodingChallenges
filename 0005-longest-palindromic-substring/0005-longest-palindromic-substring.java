class Solution {

    // public  boolean isPalindrome(String s){
    //     int sLength = s.length() - 1;

    //     for(int i = 0; i < s.length() / 2; i++){
    //         if(!(s.charAt(i) == s.charAt(sLength--))) return false;
    //     }
    //     return true;
    // }

    // Function to find the longest palindrome substring
    public  String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        // Expand around each center
        for (int i = 0; i < s.length(); i++) {
            // Odd length check, centered at one character
            int len1 = expandAroundCenter(s, i, i);
            // Even length check, centered between two characters
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get Larger of cecks
            int len = Math.max(len1, len2);

            // If the found palindrome is longer, update the start and end indices
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public  int expandAroundCenter(String s, int left, int right) {
        // Check palindrome length using 2 ptrs moving out
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length between ptrs
        return right - left - 1;
    }
}