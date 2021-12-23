package com.company.easy;

import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int x = 0; x < nums.length; x++) {
            for(int i = nums.length - 1; i >= 0; i--) {

                if(i == x) {
                    break;
                }

                if((nums[x] + nums[i]) == target) {
                    return new int[]{x,i};
                }
            }
        }

        return new int[]{};
    }

    public Boolean isPalindrome(int x) {
        String initialValueString = String.valueOf(x);
        List<Character> reversedValueCharArray = new ArrayList<>();
        for (char c: initialValueString.toCharArray()) {
            reversedValueCharArray.add(c);
        }

        Collections.reverse(reversedValueCharArray);

        StringBuilder reversedValueString = new StringBuilder();

        for (char c : reversedValueCharArray) {
            reversedValueString.append(c);
        }

        return initialValueString.equals(reversedValueString.toString());
    }

    public int romanToInt(String s) {
        String I = "1";
        String V = "5";
        String X = "10";
        String L = "50";
        String C = "100";
        String D = "500";
        String M = "1000";
        String O = "4";
        String P = "9";
        String Q = "40";
        String R = "90";
        String S = "400";
        String T = "900";

        if (s.contains("IV")) {
            s = s.replace("IV", "O");
        }

        if (s.contains("IX")) {
            s = s.replace("IX", "P");
        }

        if (s.contains("XL")) {
            s = s.replace("XL", "Q");
        }

        if (s.contains("XC")) {
            s = s.replace("XC", "R");
        }

        if (s.contains("CD")) {
            s = s.replace("CD", "S");
        }

        if (s.contains("CM")) {
            s = s.replace("CM", "T");
        }

        char[] arrayOfChar = s.toCharArray();
        List<Integer> listOfInteger = new ArrayList<>();
        for (char c : arrayOfChar) {
            switch (c) {
                case 'I' -> listOfInteger.add(Integer.parseInt(I));
                case 'V' -> listOfInteger.add(Integer.parseInt(V));
                case 'X' -> listOfInteger.add(Integer.parseInt(X));
                case 'L' -> listOfInteger.add(Integer.parseInt(L));
                case 'C' -> listOfInteger.add(Integer.parseInt(C));
                case 'D' -> listOfInteger.add(Integer.parseInt(D));
                case 'M' -> listOfInteger.add(Integer.parseInt(M));
                case 'O' -> listOfInteger.add(Integer.parseInt(O));
                case 'P' -> listOfInteger.add(Integer.parseInt(P));
                case 'Q' -> listOfInteger.add(Integer.parseInt(Q));
                case 'R' -> listOfInteger.add(Integer.parseInt(R));
                case 'S' -> listOfInteger.add(Integer.parseInt(S));
                case 'T' -> listOfInteger.add(Integer.parseInt(T));
            }
        }

        int amount = 0;
        for (int i : listOfInteger) {
            amount += i;
        }
        return amount;
    }

    public String longestCommonPrefix(String[] strs) {

        Optional<String> shortestOptionalString = Arrays.stream(strs)
                .min(Comparator.comparingInt(String::length));

        if(shortestOptionalString.isPresent()) {
            for (int i = shortestOptionalString.get().length(); i >= 0; i--) {
                String longestCommonPrefix = shortestOptionalString.get().substring(0, i);
                int count = strs.length;
                boolean flag = false;

                for (String str : strs) {
                    for (int j = 0; j < longestCommonPrefix.length(); j++) {
                        flag = str.toCharArray()[j] == longestCommonPrefix.toCharArray()[j];
                    }

                    if(str.contains(longestCommonPrefix) && flag) {
                        count--;
                    }
                }

                if(count == 0){
                    return longestCommonPrefix;
                }
            }
        }
        return "";
    }

    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        Stack<Character> stack = new Stack<>();
        for(char c: charArray) {
            if( c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty() && size % 2 == 0;
    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//
//    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() > 0 && haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else if(haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        } else {
            return -1;
        }
    }

    //TODO not sure how to deal with this one
//    public static boolean repeatedSubstringPattern(String s) {
//
//        List<Character> listChar = new ArrayList<>();
//        List<Integer> listCount = new ArrayList<>();
//
//        for(int i = 0; i < s.length(); i++){
//            int count = 0;
//            for(int y = 0; y < s.length(); y++){
//                if(s.charAt(i) == s.charAt(y)){
//                    count++;
//                }
//            }
//
//            if(listCount.size() == 0 || (listCount.get(0).equals(count) && !listChar.contains(s.charAt(i)))){
//                listChar.add(s.charAt(i));
//                listCount.add(count);
//            } else {
//                 break;
//            }
//        }
//
//        return (s.length() % listChar.size() == 0);
//
//    }
    public int searchInsert(int[] nums, int target) {

        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        if(numList.contains(target)){
            return numList.indexOf(target);
        }

        if(!numList.contains(target)) {
            for(int i = 0; i < numList.size(); i++) {
                if(numList.size() > i+ 1 && target > numList.get(i) && target < numList.get(i + 1)) {
                    return i + 1;
                }else if(target > numList.get(numList.size() - 1 )){
                    return numList.size();
                }
            }
        }
        return 0;
    }

    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        List<String> wordList = Arrays.asList(stringArray);
        return wordList.get(wordList.size()-1).length();
    }
}
