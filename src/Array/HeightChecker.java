package Array;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        // Step 1: Create a sorted version of heights
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        // Step 2: Initialize a counter for mismatches
        int mismatchCount = 0;

        // Step 3: Compare the original array with the sorted array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }

        // Step 4: Return the count of mismatches
        return mismatchCount;
    }

    public static void main(String[] args) {
        // Test case
        int[] heights = {1, 1, 4, 2, 1, 3};
        int result = heightChecker(heights);
        System.out.println(result);  // Output should be 3
    }
}

