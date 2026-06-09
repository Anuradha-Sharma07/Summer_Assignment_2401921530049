package Summer_Assignment_2401921530049.Week_2.Day_2;

import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = Integer.MIN_VALUE;

        while (windowEnd < n) {

            char ch = s.charAt(windowEnd);

            if (map.containsKey(ch) && map.get(ch) >= windowStart) {
                windowStart = map.get(ch) + 1;
            }

            map.put(ch, windowEnd);

            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);

            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring: " + result);
    }
}