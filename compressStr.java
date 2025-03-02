//leetcode-443
class Solution {
    public int compress(char[] chars) {
        String s = "";
        int count = 1; // Initialize count to 1 

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                s += chars[i]; // Append character
                if (count > 1) {
                    s += count; // Append count only if greater than 1
                }
                count = 1; // Reset count
            }
        }

        // Copy back
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length(); // Return length
    }
}
