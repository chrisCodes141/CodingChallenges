package blind75.ArraysNhashing;

import groovyjarjarantlr4.v4.runtime.misc.IntegerList;

import java.util.HashMap;
import java.util.HashSet;

public class Solutions {

    /**
     * Contains Duplicate Solutions
     */

    //TIME: O(n^2)  SPACE:
    public static boolean containsDuplicateBRUTE(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i: " + i);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("--j: " + j);
                if (nums[i] == nums[j]) {
                    System.out.println("nums i n j = " + nums[i] + " && " + nums[j]);
                    return true;
                }
            }
        }
        return false;
    }

    //TIME: O(n)  SPACE: O(n)
    public static boolean containsDuplicateHashSet(int[] nums) {

        HashSet set = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Set:" + set);
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

//    //hashims suggestion
//    public static boolean containsDuplicateHashSet(int[] nums) {
//
//    HashSet set = new HashSet();
//
//        for(
//    int i = 0;
//    i<nums.length;i++)
//
//    {
//        System.out.println("Set:" + set);
//        if (!set.add(nums[i])) return true;
//    }
//        return false;
//}

    /**
     *
     * 2 Sum Solution
     *
     */

    static public int[] twoSumForWhichNumbersMadeTarget(int[] nums, int t){
        IntegerList iL = new IntegerList();
        iL.addAll(nums);
        iL.sort();

        System.out.println("Inside function" + iL);

        int[] resultingNumbers = new int[2];

        int a = 0, z = nums.length-1, currentSum = 0;

        for(int i = 0; i < nums.length; i++){
            currentSum = iL.get(a) + iL.get(z);
            //when found, save and return
            if(t == currentSum) {
                resultingNumbers[0] = a;
                resultingNumbers[1] = z;
                System.out.println("Inside if"+currentSum);
                return resultingNumbers;
            }
            //if target < current sum, decrease bigger numbers ptr
            else if(t < currentSum) z--;
            //otherwise, target is > current sum, increase smaller numbers ptr
            else a++;
        }
        System.out.println("or here");
        return resultingNumbers;
    }

    //hashim suggested start from middle out, IMPLEMENT

    public static int[] twoSumWithHashMap(int[] nums, int targetSum){
        HashMap hM = new HashMap();

        int[] solution = new int[2];
        int dif;

        for(int i = 0; i < nums.length; i++){
            dif = targetSum - nums[i];



            System.out.println("dif = " +dif+ " = "+ targetSum +" - " +nums[i]);
            System.out.println("hm is : " + hM);
            System.out.println("hm value "+ hM.get(i));
            if(hM.containsKey(dif)){
                System.out.println("------ENTERED IF");
                solution[0] = (int) hM.get(dif);
                solution[1] = i;
                System.out.println("from if "+solution[0] + " , " + solution[1]);
                return solution;
            }
            else { System.out.println("------ENTERED Else");
                hM.put(nums[i], i);
            }
        }
        System.out.println("from end "+solution[0] + " , " + solution[1]);
        return solution;
    }

//NOOOOOOOOOOOT NOT WORKING & DONEEEEEEEEEEEEEEEEEEEEEEE
//    public static int[] twoDifWithHashMap(int[] nums, int targetDiff){
//        HashMap hM = new HashMap<Integer, Integer>();
//
//        int[] solution = new int[2];
//        int currDiff;
//
//        for(int i = 0; i < nums.length; i++){
//            currDiff = targetDiff - nums[i];
//            System.out.println("\n\ncurrentDiff = " + currDiff + "\nnums[i] = "+ nums[i]);
//            if(hM.containsKey(targetDiff)){
//                solution[0] = (int) hM.get(targetDiff);
//                solution[1] = i;
//
//                return solution;
//            }
//            else{
//                hM.put(currDiff, i);
//            }
//        }
//
//        return solution;
//    }

}
