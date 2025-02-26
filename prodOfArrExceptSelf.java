//leetcode-238
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        int[] answer = new int[n];

        // Compute prefix products
        pref[0] = 1;//to avoid wrong cal
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] * nums[i - 1];
        }

        // Compute suffix products
        suff[n - 1] = 1;//to avoid wrong cal
        for (int i = n - 2; i >= 0; i--){
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        // Compute answer
        for (int i = 0; i < n; i++) {
            answer[i] = pref[i] * suff[i];
        }

        return answer;
    }
}
