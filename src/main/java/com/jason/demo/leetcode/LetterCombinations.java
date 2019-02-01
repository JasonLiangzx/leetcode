package com.jason.demo.leetcode;

import java.util.*;

/**
 * @author: liangzx
 * @create: 2019-02-01 11:18
 **/
public class LetterCombinations {

    private static Map<String, List> letterMap = new HashMap<String, List>();

    static {
        letterMap.put("2", Arrays.asList("a", "b", "c"));
        letterMap.put("3", Arrays.asList("d", "e", "f"));
        letterMap.put("4", Arrays.asList("g", "h", "i"));
        letterMap.put("5", Arrays.asList("j", "k", "l"));
        letterMap.put("6", Arrays.asList("m", "n", "o"));
        letterMap.put("7", Arrays.asList("p", "q", "r","s"));
        letterMap.put("8", Arrays.asList("t", "u", "v"));
        letterMap.put("9", Arrays.asList("w", "x", "y","z"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        for(char c : digits.toCharArray()){
            result = multiple(result, letterMap.get(String.valueOf(c)));
        }
        return result;
    }

    private List<String> multiple(List<String> pre, List<String> characters){
        List<String> result = new ArrayList<String>();
        if(pre.isEmpty()){
            for(String character : characters){
                result.add(character.toString());
            }
            return result;
        }
        for(String str : pre){
            for(String character : characters){
                String temp = str + character;
                result.add(temp);
            }
        }
        return result;
    }
}
