package com.java8.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int[] nums = {2, 17, 7, 15};
		int target = 9;
		int[] indices = onePassSolution(nums, target);
		System.out.println(indices[0] + "    " + indices[1]);
	}
	
	//Brute force
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]) {
                	return new int[] {i, j};
                }
            }
        }
        
        return new int[2];
        
    }
	
	public static int[] onePassSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++) {
        	
        	map.put(nums[i], i);
        	int complement = target - nums[i];
        	if(map.containsKey(complement) && map.get(complement) != i) {
        		return new int[] {map.get(complement), i};
        	}
        	
        }
        
        /*for(int j=0; j<nums.length; j++) {
        	int complement = target - nums[j];
        	if(map.containsKey(complement) && map.get(complement) != j) {
        		return new int[] {map.get(nums[j]), map.get(complement)};
        	}
        }*/
        
        return new int[2];
        
        
    }

}
