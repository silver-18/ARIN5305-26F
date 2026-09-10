import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Create array of indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on digit sum first, then value
        Arrays.sort(indices, (a, b) -> {
            int sumA = digitSum(nums[a]);
            int sumB = digitSum(nums[b]);
            if (sumA != sumB) {
                return sumA - sumB;
            }
            return nums[a] - nums[b];
        });

        // Build the permutation array
        // position[i] tells us where the element at original index i should go
        int[] position = new int[n];
        for (int i = 0; i < n; i++) {
            position[indices[i]] = i;
        }

        // Find cycles and count minimum swaps
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cycleLength = 0;
                int j = i;

                // Traverse the cycle
                while (!visited[j]) {
                    visited[j] = true;
                    j = position[j];
                    cycleLength++;
                }

                // For a cycle of length k, we need k-1 swaps
                if (cycleLength > 1) {
                    swaps += cycleLength - 1;
                }
            }
        }

        return swaps;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
