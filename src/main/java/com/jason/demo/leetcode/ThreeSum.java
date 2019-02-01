package com.jason.demo.leetcode;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<Integer>> numMap = new HashMap<Integer, List<Integer>>();
        Map<String, Integer> collect = new HashMap<String, Integer>();
        nums = filterZero(nums);
        if(nums.length < 3){
            return new ArrayList();
        }
        for(int i = 0; i < nums.length; i ++){
            List<Integer> list = numMap.get(nums[i]);
            if(list == null){
                list = new ArrayList();
                numMap.put(nums[i], list);
            }
            list.add(i);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                int sum = nums[i] + nums[j];
                int other = -1*sum;
                List<Integer> list = numMap.get(other);
                if(list != null){
                    int min=0,middle=0,max=0;
                    for(Integer index : list){
                        if(index > j){
                            if(nums[i] < nums[j]){
                                if(other<nums[i]){
                                    min=other;
                                    middle=nums[i];
                                    max=nums[j];
                                }else if(other < nums[j]){
                                    min=nums[i];
                                    middle=other;
                                    max=nums[j];
                                } else{
                                    min = nums[i];
                                    middle = nums[j];
                                    max = other;
                                }
                            }else{
                                if(other<nums[j]){
                                    min=other;
                                    middle=nums[j];
                                    max=nums[i];
                                }else if(other < nums[i]){
                                    min=nums[j];
                                    middle=other;
                                    max=nums[i];
                                }else {
                                    min = nums[j];
                                    middle = nums[i];
                                    max = other;
                                }
                            }
                            String s = "" + min + middle + max;
                            if(!collect.containsKey(s)){
                                List<Integer> l1 = Arrays.asList(min,middle,max);
                                result.add(l1);
                                collect.put(s, 1);
                            }
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    private static int[] filterZero(int[] nums){
        int zeroNum = 0;

        List<Integer> newList = new ArrayList<Integer>();

        for(int num : nums){
            if(num != 0){
                newList.add(num);
            }else{
                zeroNum ++;
            }
        }
        if(zeroNum >=3){
            newList.add(0);
            newList.add(0);
            newList.add(0);
        }else if(zeroNum > 0){
            newList.add(0);
        }
        int[] newNums = new int[newList.size()];
        for(int i=0; i < newList.size(); i ++){
            newNums[i] = newList.get(i);
        }
        return newNums;
    }
}
