import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCoverageTest {

    @Test
    public void partsNeverAppearInOrder() {
        assertEquals(-1, new Solution().shortestMatchingSubstring("abc", "x*y*z"));
    }

    @Test
    public void emptyOuterPartsStillAdvanceBothPointers() {
        assertEquals(-1, new Solution().shortestMatchingSubstring("abxc", "*x*y"));
    }

    @Test
    public void repeatedPrefixMakesLpsFallBack() {
        assertEquals(4, new Solution().shortestMatchingSubstring("aabc", "aa*b*c"));
    }
}
