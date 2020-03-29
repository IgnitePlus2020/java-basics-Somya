package com.tgt.igniteplus;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*
Q. Subarray Sum Equals K
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 */
class Solution {
    /*
    for i:1 to n
        sum+=nums(i)
              if (sum-k) exits as key
                count+=value(sum-k)      !! if cumulative sum between two indices is same.elements in between summed to zero
        HashMap <-- <sum,countOfSum+1>
    */
    public static int subarraySum(int[] nums, int k) {
        int sum=0,count=0;

        LinkedHashMap<Integer, Integer> h =  new LinkedHashMap<Integer, Integer>();

        h.put(0,1);
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if(h.containsKey(sum-k))
                count+=h.get(sum-k);
            h.put(sum, h.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n,k;
        n=in.nextInt();
        k=in.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=in.nextInt();
        }
        System.out.println(subarraySum(num,2));

    }

}
/*
Input:nums = [1,1,1], k = 2
Output: 2
 */