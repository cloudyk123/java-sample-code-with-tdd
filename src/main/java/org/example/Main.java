package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class Solution {
        public int romanToInt(String s) {

            HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
            stringIntegerHashMap.put("I", 1);
            stringIntegerHashMap.put("V", 5);
            stringIntegerHashMap.put("X", 10);
            stringIntegerHashMap.put("L", 50);
            stringIntegerHashMap.put("C", 100);
            stringIntegerHashMap.put("D", 500);
            stringIntegerHashMap.put("M", 1000);
            int ans = 0;
            for(char c : s.toCharArray()) {
                if(stringIntegerHashMap.containsKey(c)) {
                    Integer represent = stringIntegerHashMap.get(c);
                    ans += represent;
                }
            }
            return ans;
        }
    }
}