package com.company.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {

    @Test
     void testTwoSum() {
        Solution test = new Solution();

        int[] result1 = new int[]{0,1};
        int[] result2 = new int[]{0,3};
        int[] result3 = new int[]{1,2};
        int[] result4 = new int[]{2,3};
        int[] result5 = new int[]{2,3};
        int[] result6 = new int[]{};

        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{1,5,2,3};
        int[] nums3 = new int[]{0,2,3,4};
        int[] nums4 = new int[]{1,2,3,3};
        int[] nums5 = new int[]{1,2,3,4};
        int[] nums6 = new int[]{1,2,3,4};

        int target1 = 3;
        int target2 = 4;
        int target3 = 5;
        int target4 = 6;
        int target5 = 7;
        int target6 = 8;

        assertEquals (result1[0], test.twoSum(nums1, target1)[0]);
        assertEquals (result1[1], test.twoSum(nums1, target1)[1]);
        assertEquals (result2[0], test.twoSum(nums2, target2)[0]);
        assertEquals (result2[1], test.twoSum(nums2, target2)[1]);
        assertEquals (result3[0], test.twoSum(nums3, target3)[0]);
        assertEquals (result3[1], test.twoSum(nums3, target3)[1]);
        assertEquals (result4[0], test.twoSum(nums4, target4)[0]);
        assertEquals (result4[1], test.twoSum(nums4, target4)[1]);
        assertEquals (result5[0], test.twoSum(nums5, target5)[0]);
        assertEquals (result5[1], test.twoSum(nums5, target5)[1]);
        assertEquals (result6.length, test.twoSum(nums6, target6).length);
    }

    @Test
    void testIsPalindrome() {
        Solution test = new Solution();
        assertEquals (true, test.isPalindrome(121));
        assertEquals (true, test.isPalindrome(1));
        assertEquals (true, test.isPalindrome(11));
        assertEquals (false, test.isPalindrome(10));
    }

    @Test
    void testRomanToInt() {
        Solution test = new Solution();
        assertEquals(3, test.romanToInt("III"));
        assertEquals(4, test.romanToInt("IV"));
        assertEquals(9, test.romanToInt("IX"));
        assertEquals(58, test.romanToInt("LVIII"));
        assertEquals(1994, test.romanToInt("MCMXCIV"));
    }

    @Test
    public void testLongestCommonPrefix() {
        Solution test = new Solution();
        assertEquals("fl", test.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", test.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("", test.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }

    @Test
    public void testIsValid() {
        Solution test = new Solution();
        assertTrue(test.isValid("()"));
        assertTrue(test.isValid("()[]{}"));
        assertFalse(test.isValid("(]"));
        assertFalse(test.isValid("([)]"));
        assertTrue(test.isValid("{[]}"));
        assertFalse(test.isValid("]"));
        assertFalse(test.isValid("({{{{}}}))"));
        assertFalse(test.isValid("([}}])"));
    }

    @Test
    public void testRemoveDuplicates() {
        Solution test = new Solution();

        int[] num1 = new int[]{1,1,2};
        int[] num2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(2, test.removeDuplicates(num1));
        assertEquals(5, test.removeDuplicates(num2));
    }

    @Test
    public void testRemoveElement() {
        Solution test = new Solution();

        int[] num1 = new int[]{1,1,2};
        int[] num2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(1, test.removeElement(num1, 1));
        assertEquals(7, test.removeElement(num2, 1));
    }

    @Test
    public void testStrStr() {
        Solution test = new Solution();

        assertEquals(2, test.strStr("hello", "ll"));
        assertEquals(-1, test.strStr("aaaa", "bba"));
        assertEquals(0, test.strStr("", ""));
    }

    @Test
    public void testSearchInsert() {
        Solution test = new Solution();

        assertEquals(4, test.searchInsert(new int[]{1,2,3,4,5}, 5));
        assertEquals(5, test.searchInsert(new int[]{1,2,3,4,5}, 6));
        assertEquals(1, test.searchInsert(new int[]{1,2,3,4,5}, 2));
        assertEquals(0, test.searchInsert(new int[]{1,2,3,4,5}, 0));
    }

}
