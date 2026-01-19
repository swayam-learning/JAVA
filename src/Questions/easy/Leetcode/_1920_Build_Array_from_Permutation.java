package Questions.easy.Leetcode;

import java.util.ArrayList;

public class _1920_Build_Array_from_Permutation {
        public static int[] buildArray(int[] nums) {
            int[] arr = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i] = nums[nums[i]];
            }
            return arr;
        }
    }