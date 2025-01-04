package blind75.SlidingWindow2Ptr;

import java.util.ArrayList;

public class Solutions {

    //Best time to buy/sell stock
    //given an array of price movement, each number being a new day of stock price, return array of day to buy, sell, and profit

    public static ArrayList<Number> buySellProfit(double[] arr) {
        // 0 = buy date, 1 = sell date, 2 = profit
        ArrayList result = new ArrayList<Number>();

        //if arr has 2 or less dates/prices, return nothing
        if(arr.length < 2) return result;

        //setting needs somthing in that spot, initialize to 0
        result.add(0, 0);
        result.add(1, 0);


        int leftPtr = 0, rightPtr;
        double maxProfit = 0.0;

        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("------------\ni = "+i+"\n--------------");
            rightPtr = i + 1;

            //check if profit
            if (arr[leftPtr] < arr[rightPtr]) {
//                System.out.println("FIRST if arr[leftPtr] < arr[rightPtr] is " + arr[leftPtr] + " AND " + arr[rightPtr]);
                //check if max is still max, if not leave prev max, if so, update max and new dates to buy / sell
                if ( maxProfit <  (arr[rightPtr] - arr[leftPtr]) ) {
//                    System.out.println("SECOND if maxProfit < arr[rightPtr] - arr[leftPtr] is  "+ maxProfit + " < " + arr[leftPtr] + " - " + arr[rightPtr]);
                    maxProfit = arr[rightPtr] - arr[leftPtr];
//                    System.out.println("MAX PROFIT: " + maxProfit);
                    result.set(0, leftPtr);
                    result.set(1, rightPtr);
                }
            }
            //if right ptr is lower than previous low, make it the new low
            if(arr[leftPtr] > arr[rightPtr]){
//                System.out.println("THIRD if arr[leftPtr] > arr[rightPtr] is " + arr[leftPtr] + " AND " + arr[rightPtr]);
                leftPtr = rightPtr;
            }
        }

        result.add(2, maxProfit);

        return result;
    }



}
