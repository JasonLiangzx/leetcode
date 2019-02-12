package com.jason.demo.leetcode;

/**
 * 20. 有效的括号
 *
 * @author: liangzx
 * @create: 2019-02-12 16:12
 **/
public class IsValid20 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if(length % 2 != 0){
            return false;
        }
        int stackSize = length / 2;
        char[] stack = new char[stackSize];
        int index = 0;
        for(int i = 0; i < length; i ++){
            char c = chars[i];
            if(c == '{' || c == '(' || c == '['){
                if(index >= stackSize){
                    return false;
                }
                stack[index ++] = c;
            } else{
                if(index == 0){
                    return false;
                }
                char dump = stack[-- index];
                if(!((dump == '{' && c == '}') || (dump == '(' && c == ')') || (dump == '[' && c == ']'))){
                    return false;
                }
            }
        }
        if(index != 0){
            return false;
        }
        return true;
    }
}
