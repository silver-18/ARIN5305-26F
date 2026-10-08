import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCoverageTest {

    @Test
    public void singleRowHasNoCoveredBuilding() {
        int[][] buildings = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}};
        assertEquals(0, new Solution().countCoveredBuildings(6, buildings));
    }

    @Test
    public void twoSeparateClustersAreBothCovered() {
        int[][] buildings = {
            {2, 1}, {2, 3}, {1, 2}, {3, 2}, {2, 2},
            {7, 6}, {7, 8}, {6, 7}, {8, 7}, {7, 7}
        };
        assertEquals(2, new Solution().countCoveredBuildings(8, buildings));
    }

    @Test
    public void mixedGridExercisesEveryConditionOutcome() {
        int[][] buildings = {
            {1, 2}, {2, 2}, {3, 2}, {2, 1}, {2, 3},
            {3, 4}, {4, 4}, {5, 4},
            {5, 5}, {4, 6}, {5, 6}, {6, 6}
        };
        assertEquals(1, new Solution().countCoveredBuildings(6, buildings));
    }
}
