import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Solution solution0 = new Solution();
        java.lang.Class<?> wildcardClass1 = solution0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Solution solution0 = new Solution();
        int[][] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = solution0.countCoveredBuildings((int) '4', intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local7>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Solution solution0 = new Solution();
        Solution solution2 = new Solution();
        int[] intArray6 = new int[] { '4', (byte) 10 };
        int[] intArray9 = new int[] { '4', (byte) 10 };
        int[] intArray12 = new int[] { '4', (byte) 10 };
        int[] intArray15 = new int[] { '4', (byte) 10 };
        int[] intArray18 = new int[] { '4', (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        int int20 = solution2.countCoveredBuildings((int) 'a', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = solution0.countCoveredBuildings(1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Solution solution0 = new Solution();
        int[] intArray4 = new int[] { '4', (byte) 10 };
        int[] intArray7 = new int[] { '4', (byte) 10 };
        int[] intArray10 = new int[] { '4', (byte) 10 };
        int[] intArray13 = new int[] { '4', (byte) 10 };
        int[] intArray16 = new int[] { '4', (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        int int18 = solution0.countCoveredBuildings((int) 'a', intArray17);
        java.lang.Class<?> wildcardClass19 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Solution solution0 = new Solution();
        int[] intArray4 = new int[] { '4', (byte) 10 };
        int[] intArray7 = new int[] { '4', (byte) 10 };
        int[] intArray10 = new int[] { '4', (byte) 10 };
        int[] intArray13 = new int[] { '4', (byte) 10 };
        int[] intArray16 = new int[] { '4', (byte) 10 };
        int[][] intArray17 = new int[][] { intArray4, intArray7, intArray10, intArray13, intArray16 };
        int int18 = solution0.countCoveredBuildings((int) 'a', intArray17);
        int[] intArray26 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray40 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[][] intArray41 = new int[][] { intArray26, intArray33, intArray40 };
        // The following exception was thrown during execution in test generation
        try {
            int int42 = solution0.countCoveredBuildings((int) '#', intArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Solution solution0 = new Solution();
        Solution solution2 = new Solution();
        int[] intArray6 = new int[] { '4', (byte) 10 };
        int[] intArray9 = new int[] { '4', (byte) 10 };
        int[] intArray12 = new int[] { '4', (byte) 10 };
        int[] intArray15 = new int[] { '4', (byte) 10 };
        int[] intArray18 = new int[] { '4', (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        int int20 = solution2.countCoveredBuildings((int) 'a', intArray19);
        int int21 = solution0.countCoveredBuildings((int) (byte) 100, intArray19);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        Solution solution0 = new Solution();
        Solution solution2 = new Solution();
        int[] intArray6 = new int[] { '4', (byte) 10 };
        int[] intArray9 = new int[] { '4', (byte) 10 };
        int[] intArray12 = new int[] { '4', (byte) 10 };
        int[] intArray15 = new int[] { '4', (byte) 10 };
        int[] intArray18 = new int[] { '4', (byte) 10 };
        int[][] intArray19 = new int[][] { intArray6, intArray9, intArray12, intArray15, intArray18 };
        int int20 = solution2.countCoveredBuildings((int) 'a', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = solution0.countCoveredBuildings((int) (byte) 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 52, 10 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }
}

