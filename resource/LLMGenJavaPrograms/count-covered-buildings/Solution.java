import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        // For each x, track min y and max y
        Map<Integer, Integer> minYForX = new HashMap<>();
        Map<Integer, Integer> maxYForX = new HashMap<>();
        // For each y, track min x and max x
        Map<Integer, Integer> minXForY = new HashMap<>();
        Map<Integer, Integer> maxXForY = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            minYForX.merge(x, y, Math::min);
            maxYForX.merge(x, y, Math::max);
            minXForY.merge(y, x, Math::min);
            maxXForY.merge(y, x, Math::max);
        }

        int count = 0;
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            boolean hasAbove = maxYForX.get(x) > y;
            boolean hasBelow = minYForX.get(x) < y;
            boolean hasLeft = minXForY.get(y) < x;
            boolean hasRight = maxXForY.get(y) > x;
            if (hasAbove && hasBelow && hasLeft && hasRight) {
                count++;
            }
        }
        return count;
    }
}
