class Solution {
    public int maxArea(int[] height) {

        //save heights, compare heights, take lesser of two height and * by distance between them, save area,
        //move lesser heights ptr to next,

        int leftPTR = 0, rightPTR = height.length - 1;

        int maxArea = 0, tempArea = 0;

        while(leftPTR != rightPTR){

            //Check for which ptr is less, calculate temp area 
            if(height[leftPTR] < height[rightPTR]){
                tempArea = height[leftPTR] * (rightPTR - leftPTR);
                leftPTR++;
            }
            else{
                tempArea = height[rightPTR] * (rightPTR - leftPTR);
                rightPTR--;
            }
            //check which ptr's next is larger, and move it there, NOTE MAYBE PROB IF SAME

            //check if tempArea is greater than maxArea, and update if so
            if (tempArea > maxArea) maxArea = tempArea;

        }

        return maxArea;
        
    }
}