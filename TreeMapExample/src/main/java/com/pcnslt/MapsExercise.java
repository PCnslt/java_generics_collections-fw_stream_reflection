package com.pcnslt;

import java.util.*;

/*Maps coding exercise
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

The result is a Set containing the indices of the two numbers.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1] (a Set contains these indices)
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2] (a Set containing these indices)*/
public class MapsExercise {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;

        System.out.println(twoSum(nums, target));

    }

    public static Set<Integer> twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Found the pair - add both indices to the Set
                result.add(map.get(complement));
                result.add(i);
                return result; // Return immediately since we only need one pair
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        return result; // Will be empty if no solution found
    }
}
