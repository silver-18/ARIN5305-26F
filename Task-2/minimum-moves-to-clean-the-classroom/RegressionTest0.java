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
        Solution solution0 = new Solution();
        java.lang.String[] strArray4 = new java.lang.String[] { "SS", "RL", ".." };
        int int6 = solution0.minMoves(strArray4, 1);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "SS", "RL", ".." });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Solution solution0 = new Solution();
        java.lang.String[] strArray4 = new java.lang.String[] { "SS", "RL", ".." };
        int int6 = solution0.minMoves(strArray4, 1);
        java.lang.Class<?> wildcardClass7 = solution0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "SS", "RL", ".." });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Solution solution0 = new Solution();
        Solution solution1 = new Solution();
        java.lang.String[] strArray5 = new java.lang.String[] { "SS", "RL", ".." };
        int int7 = solution1.minMoves(strArray5, 1);
        Solution solution8 = new Solution();
        java.lang.String[] strArray12 = new java.lang.String[] { "LL", "XL", "LL" };
        int int14 = solution8.minMoves(strArray12, 10);
        Solution solution15 = new Solution();
        java.lang.String[] strArray19 = new java.lang.String[] { "SS", "RL", ".." };
        int int21 = solution15.minMoves(strArray19, 1);
        int int23 = solution8.minMoves(strArray19, (int) ' ');
        int int25 = solution1.minMoves(strArray19, 0);
        int int27 = solution0.minMoves(strArray19, 100);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "SS", "RL", ".." });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "LL", "XL", "LL" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "SS", "RL", ".." });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Solution solution0 = new Solution();
        java.lang.String[] strArray4 = new java.lang.String[] { "LL", "XL", "LL" };
        int int6 = solution0.minMoves(strArray4, 10);
        Solution solution7 = new Solution();
        java.lang.String[] strArray11 = new java.lang.String[] { "SS", "RL", ".." };
        int int13 = solution7.minMoves(strArray11, 1);
        int int15 = solution0.minMoves(strArray11, (int) ' ');
        java.lang.Class<?> wildcardClass16 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "LL", "XL", "LL" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "SS", "RL", ".." });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

