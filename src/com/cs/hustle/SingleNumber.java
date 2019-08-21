package com.cs.hustle;


import java.util.HashMap;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> h=new HashMap<>();

        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i])) {
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }

        for(int i=0;i<nums.length;i++) {
            if(h.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String args[])
    {
        int var[]={4,1,2,1,2};
        System.out.println(singleNumber(var));
    }
}
