import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCoverageTest {

    @Test
    public void noLitterNeedsNoMove() {
        assertEquals(0, new Solution().minMoves(new String[] {".S."}, 1));
    }

    @Test
    public void energyIsResetByRAndBlockedByX() {
        assertEquals(5, new Solution().minMoves(new String[] {"S..R", "X...", "...L"}, 4));
    }

    @Test
    public void unreachableLitterReturnsMinusOne() {
        assertEquals(-1, new Solution().minMoves(new String[] {"S.X", "XXX", "LX."}, 1));
    }
}
