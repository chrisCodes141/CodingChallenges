class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] s_case = new int[n + 1];
        s_case[0] = 1;
        s_case[1] = 1;
        for (int i = 2; i <= n; i++) {
            s_case[i] = s_case[i - 1] + s_case[i - 2];
        }      
        System.out.println(s_case[n]);    
        return s_case[n];
    }
}