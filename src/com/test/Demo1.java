package com.test;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

    public static int lengthOfLongestSubstring(String s) {
    	//data1
    	//data2
    	//data3
    	//data4
	//data5
    	
        // Base condition
        if (s == null || s.equals("")) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> uniqueCharacters = new HashSet<>();
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
    	String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

        s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));

        s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

	}
}
