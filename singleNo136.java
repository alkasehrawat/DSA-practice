//leetcode-136
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // do XOR
        }
        return result; //unique no
    }
}
