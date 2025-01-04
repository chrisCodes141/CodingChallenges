package BigOFuncExs;

/**
 * This class shows from top to bottom the fastest to slowest BigO algorithm examples
 *
 * Big O always focuses on worst case for algorithm
 * Constants (and lesser impacting parts) are ignored, focus on worst
 */

public class Examples {


    //has a constant, never changes, doesn't affect anything, can be removed from Big0 evaluation
    //O(1)
    public static void bigO1Func(int[] n) {
        System.out.println("1 everytime");
    }

    //In CS everything is base 2, unless stated otherwise
    // In essence with log n algorithm, n will be halfed each iteration
    // EX: when n = 16, 4 iterations
    //      when n = 15, 3 iterations
    // when n = 8, 3 iterations
    // when n = 7, 2 iterations
    // ....
    // when n = 2, 1 iteration
    //O(n)
    public static void logNFunc(int n) {
        if (n <= 1) return;

        n = n / 2;
        System.out.println("n is: " + n);
        logNFunc(n);
    }


    //Linear function, as N grows the amount of time / memory scales linearly with it, basically 1 : 1
    //O(logn)
    public static void nFunc(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("i is : " + i + "\nand n[i] is " + n[i] + "\n-------------------");
        }
    }

    //O(nlogn)
    public static void nLogNFunc(int n) {

        int InitialForLoopCount = n;
        int IterationsCount = 0;

        while (n > 1) {
            IterationsCount++;
            System.out.println("\nNext While Cycle # = " + IterationsCount);
            n /= 2;

            for (int i = 1; i < InitialForLoopCount; i++) {
                System.out.println(i);
            }

        }
        System.out.println("\nIterations Count = " + IterationsCount);
    }

    //O(n^2)
    public static void nSquaredFunc(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("\nI began new cycle-------------------");
            for (int j = 0; j < n.length; j++) {
                System.out.println("i is " + i + " && j is " + j);
            }
        }
    }

    //O(n^3)
    public static void nCubedFunc(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("\nI began new cycle-------------------");
            for (int j = 0; j < n.length; j++) {
                System.out.println("\nJ began new cycle-------------------");
                for (int k = 0; k < n.length; k++) {
                    System.out.println("i is " + i + " && j is " + j + " && k is " + k);
                }
            }
        }
    }

    //fib recursive call
    //Each level of call stack is the n in 2^n
    //O(n^2)
    public static int nExponentialFunc(int n){
        System.out.println("n is " + n);
        if(n==0) return 0;
        if(n==1) return 1;
        return nExponentialFunc(n-1) + nExponentialFunc(n-2);
    }


    //For each n, we will recall function n times producing n loops that call more...
    //O(n!)
    public static void nFactorialFunc(int n){
        if(n == 0){
            System.out.println("****************");
        }
        for(int i = 0; i < n; i++){
            System.out.println("In For making more calls, i = " + i + " and n = " + n);
            nFactorialFunc(n-1);
        }
    }
}

