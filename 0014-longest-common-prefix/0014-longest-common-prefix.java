class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder strB = new StringBuilder();
        int j = 0; // Start with the first character in each string

        while (true) {
            // Take the character from the first string at position j
            char currentChar;
            if (strs[0].length() <= j) break; // If any string is shorter than j, exit

            currentChar = strs[0].charAt(j);
            
            // Compare with the same character in all other strings
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= j || strs[i].charAt(j) != currentChar) {
                    return strB.toString(); // If mismatch or one string is shorter, return the result so far
                }
            }
            
            // If all strings have the same character at position j, add it to the result
            strB.append(currentChar);
            j++; // Move to the next character position
        }

        return strB.toString();
    }

}