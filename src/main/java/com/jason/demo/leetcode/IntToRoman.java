package com.jason.demo.leetcode;

public class IntToRoman {

    private static char[] romans = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public static String intToRoman(int num) {
        int i1 = num / 1000;
        String result = transfer(' ', ' ', romans[6], i1);
        num = num % 1000;
        int i2 = num / 100;
        String str = transfer(romans[6], romans[5], romans[4], i2);
        result += str;
        num = num % 100;
        int i3 = num / 10;
        str = transfer(romans[4], romans[3], romans[2], i3);
        result += str;
        num = num % 10;
        str = transfer(romans[2], romans[1], romans[0], num);
        return result + str;
    }

    private static String transfer(char ten, char half, char unit, int num){
        String result = "";
        if(num == 0) {
            return "";
        }
        if(num < 4){
            for(int i = 0; i < num; i ++){
                result += unit;
            }
        } else if(num == 4){
            return result + unit + half;
        } else if(num == 5){
            return result + half;
        }else if(num < 9){
            result = result + half;
            for(int i = 0; i < num - 5; i ++){
                result += unit;
            }
        } else if(num == 9){
            return result + unit + ten;
        }
        return result;
    }
}
