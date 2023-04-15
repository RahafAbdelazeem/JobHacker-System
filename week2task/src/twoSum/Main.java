package twoSum;

import java.util.HashMap;
import java.util.Map;

class solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> number= new HashMap<>();
        for (int i =0; i<nums.length;i++){
            number.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int result = target- nums[i];
            if (number.containsKey(result) && number.get(result)!=i){
                return new  int[]{i,number.get(result)};

            }

        }
        return null;
    }
}


public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        solution  solution = new solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two elements that add up to target: [" + result[0] + ", " + result[1] + "]");
    }

    }


