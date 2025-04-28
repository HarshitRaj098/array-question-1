public class SortedAndRotated {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        
        // Count the number of places where the array is decreasing
        int countDecreasing = 0;

        // Check for sorted and rotated condition
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                countDecreasing++;
            }
        }

        // If there is exactly one decreasing pair, it's sorted and rotated
        // or if it's already sorted without any rotation.
        return countDecreasing == 1 || countDecreasing == 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        if (isSortedAndRotated(arr)) {
            System.out.println("Array is sorted and rotated.");
        } else {
            System.out.println("Array is NOT sorted and rotated.");
        }
    }
}
