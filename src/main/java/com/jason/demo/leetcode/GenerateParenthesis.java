package com.jason.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 *
 * @author: liangzx
 * @create: 2019-02-14 09:19
 **/
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        if(n < 1){
            return list;
        }
        if(n == 1){
            list.add("()");
            return list;
        }

        char[] chars = new char[n * 2];

        chars[0] = '(';

        int index = 1;

        int s = 1,e = 0;

        solo(chars,list,index,s,e,n);

        return list;

    }

    private void solo(char[] chars,List list,int index,int s,int e,int n){
        if(e > s){
            return;
        }else{
            if(index == chars.length - 1){
                if(s == e + 1){
                    chars[index] = ')';
                    list.add(String.valueOf(chars));
                }
                return;
            }
            if(s < n){
                chars[index] = '(';
                solo(chars,list,index+1,s+1,e,n);
            }
            chars[index] = ')';
            solo(chars,list,index+1,s,e+1,n);
        }
    }
}
