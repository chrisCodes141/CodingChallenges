package blind75.DynamicProgramming;

public class climbingStairs {
    //Fibonacci seq (every new # is the sum of previous 2
    static public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] s_case = new int[n + 1];
        s_case[0] = 1;
        s_case[1] = 1;
        for (int i = 2; i <= n; i++) {
            System.out.println("i = " + i +  " && [i]: " + s_case[i]);
            s_case[i] = s_case[i - 1] + s_case[i - 2];
            System.out.println("--- i: " + s_case[i] + " && i-1: " + s_case[i-1] + " && i-2: " + s_case[i-2] + "\n");
        }

        return s_case[n];
    }
}


