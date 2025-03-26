// Last occurrence of a number in an array using recursion
public class lastOccurrenceINArrByR {
    public static int lastOccurrence(int[] arr, int i, int target) {
        if (i < 0) {
            return -1; // Base case: If index is out of bounds, return -1
        }
        if (arr[i] == target) {
            return i; // If the target is found, return the current index
        }
        return lastOccurrence(arr, i - 1, target); // Recur for the previous index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(lastOccurrence(arr, arr.length - 1, target)); // Start from the last index
    }
}
