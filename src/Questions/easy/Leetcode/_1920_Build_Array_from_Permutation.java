package Questions.easy.Leetcode;

public class _1920_Build_Array_from_Permutation {
        public int[] buildArray(int[] nums) {
            int[] arr = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i] = nums[nums[i]];
            }
            return arr;
        }

    }