import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    void test() {

        assertEquals(1994, new Solution().romanToInt("MCMXCIV"));
    }


}

class Solution {
    public int romanToInt(String s) {

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("I", 1);
        stringIntegerHashMap.put("V", 5);
        stringIntegerHashMap.put("X", 10);
        stringIntegerHashMap.put("L", 50);
        stringIntegerHashMap.put("C", 100);
        stringIntegerHashMap.put("D", 500);
        stringIntegerHashMap.put("M", 1000);
        int ans = 0;
        String p = "";
        String[] arr = s.split("");
        for (String c : arr) {

            if (stringIntegerHashMap.containsKey(c)) {
                Integer represent = stringIntegerHashMap.get(c);
                ans += represent;
            }
            if ((p .equals("I") && c .equals("V")) || (p .equals("I") && c .equals("X")))
                ans -= 2;
            else if ((p .equals("X") && c .equals("L")) || (p .equals("X") && c .equals("C")))
                ans -= 20;
            else if ((p .equals("C") && c .equals("D")) || (p.equals("C") && c.equals("M")))
                ans -= 200;


            p = c;
        }
        return ans;
    }
}
