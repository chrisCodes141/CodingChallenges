class Solution {
    public boolean isPalindrome(int x) {

        StringBuilder strB = new StringBuilder();
        strB.append(x);

        int xLength = strB.length();
        int j = xLength - 1;

        for(int i = 0; i <= xLength / 2; i++){
            if (strB.charAt(i) != strB.charAt(j--)) return false;
        }
        
        return true;
    }
}