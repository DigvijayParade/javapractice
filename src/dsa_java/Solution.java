package dsa_java ;

import java.util.Arrays;

public class Solution {

    public static void main(String[]args){

        int [] nums = {4,6,1,8};

        for(int i = 1 ; i < nums.length  ; i++){

            nums[i] = nums[i] + nums[i-1];
        }
        
        
        System.out.println(Arrays.toString(nums));
    }
        


    }
