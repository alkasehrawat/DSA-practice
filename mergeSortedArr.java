//leetcode-88
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0; // to iterate over nums1
        int j = 0; // to iterate over nums2
        int k = 0; // to iterate over result

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of nums1
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // Copy
        for (int l = 0; l < m + n; l++) {
            nums1[l] = result[l];
        }
    }
}
