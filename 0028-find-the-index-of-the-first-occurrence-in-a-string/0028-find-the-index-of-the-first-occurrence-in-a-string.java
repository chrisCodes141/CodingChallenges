class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length(), stackLength = haystack.length();

        if (needleLength == 0) return 0;

        //iterate over entire stack
        for (int i = 0; i <= stackLength - needleLength; i++) {
            int j = 0;
        
            //compare characters while they match
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // if the lengths are same, since characters same, needle in hay stack found and return curr iteration
            if (j == needleLength) {
                return i;
            }
        }

        return -1;
    }   
}