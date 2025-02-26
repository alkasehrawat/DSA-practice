//leetcode-50
class Solution {
    public double myPow(double x, int n) {
        // Handle edge case when n is Integer.MIN_VALUE
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;  // Convert negative exponent to positive
        }

        double result = 1.0;
        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>= 1; 
        }
        return result;
    }
}
