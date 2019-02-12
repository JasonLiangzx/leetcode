package com.jason.demo.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetcodeTest {

    @Test
    public void test2(){
        assertEquals(LengthOfSubString.lengthOfLongestSubstring("a"), 1);
        // assert LengthOfSubString.lengthOfLongestSubstring("a") == 1;
        // assert LengthOfSubString.lengthOfLongestSubstring("abb") == 3;
        // assert LengthOfSubString.lengthOfLongestSubstring("aab") == 2;
        // assert LengthOfSubString.lengthOfLongestSubstring("aba") == 2;
        // assert LengthOfSubString.lengthOfLongestSubstring("abcb") == 3;
        // assert LengthOfSubString.lengthOfLongestSubstring("abcdafb") == 5;
        // assert LengthOfSubString.lengthOfLongestSubstring("ohomm") == 3;
    }

    @Test
    public void convertTest(){
        assert "LCIRETOESIIGEDHN".equalsIgnoreCase(ConvertZ.convert("LEETCODEISHIRING", 3));
        assert "ABC".equalsIgnoreCase(ConvertZ.convert("ABC", 8));
    }

    @Test
    public void reverseTest(){
        assert 1234 == IntegerReverse.reverse(4321);
        assert 0 == IntegerReverse.reverse(Integer.MAX_VALUE);
        assert -1234 == IntegerReverse.reverse(-4321);
        assert -2143847412 == IntegerReverse.reverse(-2147483412);
    }

    @Test
    public void aToITest(){
        assert  -42 == AToI.myAtoi("   -42");
        assert 3 == AToI.myAtoi("3.1415");
        assert 12345678 == AToI.myAtoi("  0000000000012345678");
        assert 0 == AToI.myAtoi("   +0 123");
        assert 0 == AToI.myAtoi("");
        assert 0 == AToI.myAtoi("fdskjfjhjks 987");
    }

    @Test
    public void palindromeIntTest(){
        assert false == PalindromeInt.isPalindrome(-124);
        assert false == PalindromeInt.isPalindrome(123);
        assert true == PalindromeInt.isPalindrome(121);
        assert true ==  PalindromeInt.isPalindrome(1);
        assert true == PalindromeInt.isPalindrome(1221);
    }

    @Test
    public void maxAreaTest(){
        assert 49 == MaxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        assert 1 == MaxArea.maxArea(new int[]{1,1});
        assert 49 == MaxArea.maxArea2(new int[]{1,8,6,2,5,4,8,3,7});
        assert 1 == MaxArea.maxArea2(new int[]{1,1});
    }

    @Test
    public void intToRomanTest(){
        assert "III".equals(IntToRoman.intToRoman(3));
        assert "M".equals(IntToRoman.intToRoman(1000));
        assert "MMMCMXCIX".equals(IntToRoman.intToRoman(3999));
        assert "IV".equals(IntToRoman.intToRoman(4));
        assert "MMMCDXLIV".equals(IntToRoman.intToRoman(3444));
    }

    @Test
    public void threeNumClosest(){
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1,2,1,4}, 1));
        assertEquals(82, ThreeSumClosest.threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82));
    }

    @Test
    public void letterCombinationsTest(){
        LetterCombinations letterCombinations = new LetterCombinations();

        System.out.println(letterCombinations.letterCombinations("2"));
        System.out.println(letterCombinations.letterCombinations("23"));
    }

    @Test
    public void fourSumTest(){
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

    @Test
    public void removeNthFromEnd(){
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        RemoveNthFromEnd.ListNode listNode = new RemoveNthFromEnd.ListNode(1);
        RemoveNthFromEnd.ListNode result = removeNthFromEnd.removeNthFromEnd(listNode, 1);
        System.out.println(removeNthFromEnd);
    }
}
