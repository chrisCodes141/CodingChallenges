class Solution {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        // Get the previous sequence
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        
        for (int i = 0; i < prev.length(); i++) {
            // If next character is the same, increment count
            if (i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i + 1)) {
                count++;
            } else {
                // Append count and digit to result
                result.append(count).append(prev.charAt(i));
                count = 1;  // Reset count
            }
        }
        
        return result.toString();
    }
}