import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCoverageTest {

    @Test
    public void oneSwapIsEnough() {
        assertEquals(1, new Solution().minSwaps(new int[] {2, 1}));
    }

    @Test
    public void equalDigitSumIsBrokenByValue() {
        assertEquals(1, new Solution().minSwaps(new int[] {10, 1}));
    }

    @Test
    public void threeElementCycleNeedsTwoSwaps() {
        assertEquals(2, new Solution().minSwaps(new int[] {5, 100, 2}));
    }
}
