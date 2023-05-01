package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_2_Test6 {

    public static boolean debug = false;

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3000");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3001");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\r');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '\r', (int) (byte) 10);
        char[] charArray18 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean22, (int) '\000');
        char[] charArray28 = new char[] { '\n', 'a' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray28, (-100));
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int[] intArray33 = new int[] {};
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray33);
        boolean boolean36 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray33);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray33, (int) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3002");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 100, 1.0d, 10.0f, true };
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray6, (java.lang.Object) 999999999, (int) '4');
        comp5111.assignment.cut.Subject.NumberTasks numberTasks10 = new comp5111.assignment.cut.Subject.NumberTasks();
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray6, (java.lang.Object) numberTasks10, 35);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) 35, (-13));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100, 1.0, 10.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100, 1.0, 10.0, true]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3003");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhh!hhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!i!hi!i!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhh!hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3006");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "h!h!hhh", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3007");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-62), (int) (byte) 10);
        char[] charArray18 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!h", charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!hh", charArray18);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray18, (-19));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3008");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3009");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3010");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3011");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!i!hi!i!hi!i", "hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!hi!i!hi!i" + "'", str2, "hi!i!hi!i!hi!i");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("ihhh!hhh!hhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3015");
        char[] charArray7 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(10, (-3), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3017");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3018");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ihhh!hhh!hhihhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3019");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ihhh!hhh!hhihhh!hhh!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3022");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 1, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3024");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('4', '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3025");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3026");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh!hhh", "hh!!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3027");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-84), (-19), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3029");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-1), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3031");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-17), 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3033");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        comp5111.assignment.cut.Subject.StringTasks stringTasks2 = new comp5111.assignment.cut.Subject.StringTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) stringTasks2, (int) (byte) -1);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, (short) 0, true };
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray13 = new int[] { 10 };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, (java.lang.Object) boolean17, (-9));
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean17, (int) (short) 100);
        char[] charArray35 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray35);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray35);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray35, 9);
        java.lang.Class<?> wildcardClass48 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3034");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!h" + "'", str1, "hh!!h");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3035");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!i");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) "", 999999999);
        char[] charArray17 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray17, (int) (short) -1);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean23, (-52));
        comp5111.assignment.cut.Subject.NumberTasks numberTasks26 = new comp5111.assignment.cut.Subject.NumberTasks();
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) numberTasks26, (-97));
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) numberTasks26, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3036");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!h!", "hhh!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3037");
        int[] intArray2 = new int[] { (-13), (-32) };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-13, -32]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3038");
        int[] intArray5 = new int[] { (-42), (byte) 10, (-2), 999999999, 100 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-42, 10, -2, 999999999, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hh!!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) -1, 42, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3041");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hhh!hh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!i!i!hi!i!i!hi!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3043");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 100, (int) (short) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhh!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) strArray10, (-62));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3044");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3045");
        char[] charArray4 = new char[] { '\n', 'a' };
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ii", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3046");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3047");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-20));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3048");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("h!h!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3049");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3050");
        char[] charArray5 = new char[] { '\n', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3051");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhh!hhh!hhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3052");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!i!hi!i!hi!i!", (java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3053");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("ihhh!hhh!hhihhh!hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3054");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!", "ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3055");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hhh!hi", "ihhh!hhh!hhihhh!hhh!h", "hh!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hhh!hi" + "'", str3, "hh!!hhh!hi");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3056");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, (-10), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3057");
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(16, (-39), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3059");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(5, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!!hi!i!!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi!i!!hi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3061");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3063");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-11), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3064");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3065");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!hi!hi");
        char[] charArray14 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean18, 0);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 0, 0);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-39), (-100));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3066");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) ' ');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-45), 30);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3067");
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hh!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3068");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hi!i!hi!i!hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3069");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3070");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3071");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "h!h!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3072");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3073");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3074");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3075");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!hhh", "i", "h!h!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh" + "'", str3, "hhh!hhh");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3076");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("ihhh!hhh!hhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3077");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!h", (java.lang.CharSequence) "ihhh!hhh!hhihhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3078");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3079");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhh!hhihhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3080");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("i!i!i");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3081");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) -1, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3082");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "ihhh!hhh!hhi", (java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3083");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("ihhh!hhh!hhihhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3084");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "h!h!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3085");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!h!", "hh!!hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3086");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(2, (-11), 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3088");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!hh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3089");
        int[] intArray1 = new int[] { 10 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3090");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("ihhh!hhh!hhihhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3091");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hhh!h", "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hhh!h" + "'", str3, "hh!!hhh!h");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3092");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3093");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!i!", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3094");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hi!hi", (java.lang.CharSequence) "hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3095");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhh!hhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3096");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3097");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i", (java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3098");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!h!hh", "hh!!hhh!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3099");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3100");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(21, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-99), 30, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3102");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        char[] charArray9 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray9, (-87));
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3103");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), (-39), 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3105");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-90));
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray7, 20);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) "", 999999999);
        char[] charArray23 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray23);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray23);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) charArray23, (int) (short) -1);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) "", (-90));
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) (short) 10, (int) '\000');
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) strArray30, (-90));
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-90), (-65));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3106");
        char[] charArray4 = new char[] { '\n', 'a' };
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3108");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h!h!hhh", "hh!!i!i", "hi!i!hi!i!hi!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!h!hhh" + "'", str3, "h!h!hhh");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3109");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-13), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3111");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3112");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (int) '\r', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hi!i!i!hi!i!i!hi!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!i!i!hi!i!i!hi!i!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3114");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("ihhh!hhh!hhi");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!i");
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) strArray7, 3);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray7, 12);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int11, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3115");
        comp5111.assignment.cut.Subject.CharTasks charTasks0 = new comp5111.assignment.cut.Subject.CharTasks();
        java.lang.Class<?> wildcardClass1 = charTasks0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3116");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!!hhh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hhh!h" + "'", str1, "hh!!hhh!h");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3117");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h!h!hh", "ihhh!hhh!hhihhh!hhh!h", "hh!!hhh!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!h!hh" + "'", str3, "h!h!hh");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3118");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hh!!hi!i!!hi!i", "hhh!hhh!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3119");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h!", (java.lang.CharSequence) "h!h!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("h!h!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!h!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3121");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ihhh!hhh!hhihhh!!i!", "h", "hhh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!" + "'", str3, "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3122");
        char[] charArray4 = new char[] { '\n', 'a' };
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("ihhh!hhh!hhihhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhihhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3124");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("ihhh!hhh!hhihhh!", "i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihhh!hhh!hhihhh" + "'", str2, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3125");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!i");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-52), (-42));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3126");
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!", charArray3);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3127");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3128");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3129");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3130");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3131");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hi!i!!hi!i", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("ihhh!hhh!hhihhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character i is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3133");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hh!!hi!i!!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3135");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi", "hh!!hhh!hi", "hh!!i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("ihhh!hhh!hhihhh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhihhh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3137");
        int[] intArray4 = new int[] { (-20), (-35), 65, ' ' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-20, -35, 65, 32]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3138");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3139");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!hi!i!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3140");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("ihhh!hhh!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3142");
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hi!i!!hi!i", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("ihhh!hhh!hhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3144");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("h!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!h" + "'", str1, "h!h");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("ihhh!hhh!hhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ihhh!hhh!hhihhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3146");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-65), 9, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3147");
        char[] charArray12 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3148");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhh!hhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3149");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3150");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!i!" + "'", str1, "hh!!i!");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3151");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!hhh", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3152");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3153");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh!hh" + "'", str1, "hhh!hh");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3154");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", 999999999);
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray15, (int) (short) -1);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hhh!hhh", charArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3155");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("ihhh!hhh!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hh" + "'", str1, "ihhh!hhh!hh");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3156");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-101), 999999999, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hi!i!hi!i!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!hi!i!hi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3159");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "", "hh!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hi" + "'", str3, "hh!!hi");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3160");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh!", (java.lang.CharSequence) "hh!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3162");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(97, (-19), (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3163");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "ii", (java.lang.CharSequence) "hh!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3164");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "", 999999999);
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray14, (int) (short) -1);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i!", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3165");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3166");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh!!hi!i!!hi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hi!i!!hi!" + "'", str1, "hh!!hi!i!!hi!");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3167");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, 31, (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3168");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 25);
        java.lang.Class<?> wildcardClass19 = strArray1.getClass();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3169");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 11, (-65));
        char[] charArray12 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi!", 87);
        char[] charArray30 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray30);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray30);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray30);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray30, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3170");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!i");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int[] intArray5 = new int[] { 10 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean8, (int) '\r');
        java.lang.Object obj11 = new java.lang.Object();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj11, (int) '#');
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int13, (-25));
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!i");
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) "", 999999999);
        char[] charArray31 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) charArray31, (int) (short) -1);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray17, (java.lang.Object) boolean37, (-52));
        comp5111.assignment.cut.Subject.NumberTasks numberTasks40 = new comp5111.assignment.cut.Subject.NumberTasks();
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray17, (java.lang.Object) numberTasks40, (-97));
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray17, 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("ihhh!hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!", "hi!i!hi!i!hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3173");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "ihhh!hhh!hhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3174");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-39));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3175");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!hhh", "hi", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh" + "'", str3, "hhh!hhh");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3176");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!i!hi!i!hi!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3177");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3178");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "h!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3179");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("ihhh!hhh!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3181");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i!i!", "hhi", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!i!" + "'", str3, "i!i!i!");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3182");
        char[] charArray12 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhh!hhihhh!!i!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3183");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i" + "'", str1, "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3184");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3185");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hh!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3186");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3187");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(30, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-84), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3189");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i!i", "hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!i" + "'", str3, "i!i!i");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("ihhh!hhh!hhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3191");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh!hhh!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh!hhh!" + "'", str2, "hhh!hhh!");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3192");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!", "hhhi!", "h!h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!h!" + "'", str3, "h!h!");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3193");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3194");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3195");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(22, (-32), (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3197");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!!hi!i!!hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi!i!!hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hh!!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3200");
        char[] charArray9 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!h!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3201");
        char[] charArray17 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray17);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!hhi!!", charArray17);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", charArray17);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!h!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3202");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhh!hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3203");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hi!i!hi!i!hi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!hi!i!hi!i" + "'", str1, "hi!i!hi!i!hi!i");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3204");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-22), 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3205");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("ihhh!hhh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hh" + "'", str1, "ihhh!hhh!hh");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(6, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3207");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hi!i!hi!i!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3208");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ihhh!hhh!hhi", "i!", "i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihhh!hhh!hhi" + "'", str3, "ihhh!hhh!hhi");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3209");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!h", (java.lang.CharSequence) "hhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3210");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\r');
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "", 100);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) int9, (int) (byte) 10);
        char[] charArray17 = new char[] { '\n', 'a' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) boolean20, 10);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) 65, (-1));
        java.lang.Class<?> wildcardClass26 = strArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("ihhh!hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!hhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3212");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3213");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3214");
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3215");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3216");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3217");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(62, (-97), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3218");
        char[] charArray17 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray17);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!hhi!!", charArray17);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", charArray17);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3219");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 90, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3220");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3221");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("ihhh!hhh!hhihhh!hhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh!hhh!" + "'", str1, "ihhh!hhh!hhihhh!hhh!");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3222");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh", (java.lang.CharSequence) "hi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3223");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ihhh!hhh!hhihhh", "hi!i", "hhh!hhh!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihhh!hhh!hhihhh" + "'", str3, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3224");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi", (java.lang.CharSequence) "h!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3225");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3227");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!i!i!");
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray8);
        char[] charArray14 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray14, (-87));
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray14);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray14, 30);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray14, (int) (short) -1);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray14);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3229");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean15, (-101));
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int[] intArray21 = new int[] { 10 };
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray21);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray21);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) boolean24, (int) '\r');
        char[] charArray30 = new char[] { '\n', 'a' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) boolean33, (int) (short) 100);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (short) 100, (int) (byte) 10);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "ihhh!hhh!hhihhh", 31);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3230");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3231");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 7, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3232");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3233");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i", (java.lang.CharSequence) "hh!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3234");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh!!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3235");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 100, (-97), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-25), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3237");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!i!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3238");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!hh!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!hh!" + "'", str2, "hh!!hh!");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '#', 0, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3240");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3241");
        int[] intArray1 = new int[] { 31 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[31]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3242");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, (int) 'a');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 100, (short) 0, true };
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray24, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray29 = new int[] { 10 };
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray29);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray29);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray24, (java.lang.Object) boolean33, (-9));
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray24);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray24, 8);
        java.lang.Class<?> wildcardClass39 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3243");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3244");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", (java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3245");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i", (java.lang.CharSequence) "h!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3246");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!i!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3247");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray4);
        char[] charArray10 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray10, (-87));
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!", charArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (-84), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3249");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3250");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hi!h", "hh!!", "hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hi!h" + "'", str3, "hhh!hi!h");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3251");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhh!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3252");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!i!hi!i!hi!i", "hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!hi!i!hi!" + "'", str2, "hi!i!hi!i!hi!");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3253");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh!!i!" + "'", str1, "ihhh!hhh!hhihhh!!i!");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3254");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "ihhh!hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3255");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhh!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3256");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) '\r');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) '\r', (int) (byte) 10);
        char[] charArray20 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean24, (int) '\000');
        char[] charArray30 = new char[] { '\n', 'a' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray30, (-100));
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray30);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hhh", charArray30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3257");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(15, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hh!!hi!i!!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3259");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray7);
        char[] charArray13 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray13, (-87));
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray13, 30);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray13);
        java.lang.Class<?> wildcardClass22 = charArray13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3260");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!");
        int[] intArray3 = new int[] { 31 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray3, 20);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[31]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3261");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhh!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3262");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(3, 4, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3263");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hh!!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3264");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!hi!i!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhh!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3266");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3267");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hi!i!i!hi!i!i!hi!i!i!", "ihhh!hhh!hhihhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3268");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i", "hh!!hi!h", "hh!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i" + "'", str3, "hi!i");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3269");
        char[] charArray10 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3270");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3271");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("ihhh!hhh!hhihhh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ihhh!hhh!hhihhh!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3273");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3274");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!hi!i!hi!i!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3275");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(17, 29, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3276");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!!i");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hh!!hi!i!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3278");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhh!hhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh!hhh!" + "'", str1, "hhh!hhh!");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3279");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhh!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3280");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!", "ihhh!hhh!hhihhh!hhh", "hhh!hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!" + "'", str3, "hhhi!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, (-35), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3282");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh!!hi!i!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3283");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hhh!hi", (java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3284");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, 45, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3285");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!hi!i!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', (-52), (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3287");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\r');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '\r', (int) (byte) 10);
        char[] charArray18 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean22, (int) '\000');
        char[] charArray28 = new char[] { '\n', 'a' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray28, (-100));
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 100L, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3288");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i!i!", "hhh!hhh!hhh", "ii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!i!" + "'", str3, "i!i!i!");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3289");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!i", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3290");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3291");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh!hhh", (java.lang.CharSequence) "hh!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3292");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3293");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3294");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 10, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3296");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray8);
        char[] charArray14 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray14, (-87));
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray14, 30);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i!", charArray14);
        java.lang.Class<?> wildcardClass24 = charArray14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3297");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) ' ', 45, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3298");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(29, (-90), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3299");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hi!i!hi!i!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!hi!i!hi!" + "'", str1, "hi!i!hi!i!hi!");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3300");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hi!i!!hi!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3301");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3303");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh!!i!" + "'", str1, "ihhh!hhh!hhihhh!!i!");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3304");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("ihhh!hhh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!h" + "'", str1, "ihhh!hhh!h");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(48, (-100), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3306");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (short) 0, 999999999);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-9), 999999999);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3307");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3308");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3309");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!", charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3310");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhh!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh!hi!h" + "'", str1, "hhh!hi!h");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-17), (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3312");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi", "hhh!hhh", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3313");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("ihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3314");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-101), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3315");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hi!hi", (java.lang.CharSequence) "hhh!hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hh!!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3317");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!hhh", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3318");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("ihhh!hhh!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("ihhh!hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ihhh!hhh!hh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3320");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!i!i");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, 10);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3321");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-52), 13, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3322");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3323");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!hh!", "hi!i!i!hi!i!i!hi!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3324");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 0, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3325");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj5, (int) (short) 1);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) "", 999999999);
        char[] charArray21 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray21);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray21);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) charArray21, (int) (short) -1);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray21, (-52));
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray21);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i!hi!i!hi!i", charArray21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3326");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        char[] charArray9 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray9, (-87));
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3327");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3328");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3330");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!h", charArray15);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "ihhh!hhh!hhihhh!hhh!h", (int) (byte) 0);
        java.lang.Object obj26 = null;
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj26, (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3331");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("ihhh!hhh!hhihhh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h!h!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3332");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!i!i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3334");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-45), 19, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3335");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ihhh!hhh!hhihhh!hhh!hh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3336");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhh!hhh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh!hhh!h" + "'", str1, "hhh!hhh!h");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3337");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray7);
        char[] charArray13 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray13, (-87));
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray13, 30);
        char[] charArray35 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray35);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray35);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray35);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray35);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray35, 87);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!hi!h", charArray35);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hi!i!hi!i!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!hi!i!hi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3339");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        char[] charArray8 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray8, (-87));
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!hh", charArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3340");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hhh!hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3341");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hi!i!i!hi!i!i!hi!i!i!", "ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3342");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hh!!hi!i!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) -1, (-999999999), (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3344");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, 21, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3345");
        char[] charArray10 = new char[] { '\n', 'a' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hhh!hi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!i", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3346");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!hi!i!!hi!i", "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!hi!i!!h" + "'", str2, "hh!!hi!i!!h");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3347");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hi!i!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3348");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!hh", charArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3349");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3350");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3351");
        char[] charArray5 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3352");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(11, (-19), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3353");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray4, 999999999);
        char[] charArray16 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray16);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int22, 62);
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        comp5111.assignment.cut.Subject.StringTasks stringTasks27 = new comp5111.assignment.cut.Subject.StringTasks();
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) stringTasks27, (int) (byte) -1);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 100, (short) 0, true };
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray38 = new int[] { 10 };
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) boolean42, (-9));
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) boolean42, (int) (short) 100);
        java.lang.String[] strArray48 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) "hi", (int) (byte) 0);
        char[] charArray53 = new char[] {};
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray53);
        boolean boolean55 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray53);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) charArray53, 97);
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int57, 0);
        char[] charArray73 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean74 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray73);
        boolean boolean75 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray73);
        boolean boolean76 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray73);
        boolean boolean77 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray73);
        boolean boolean78 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray73);
        boolean boolean79 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray73);
        boolean boolean80 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray73);
        boolean boolean81 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray73);
        java.lang.Class<?> wildcardClass82 = charArray73.getClass();
        int int84 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass82, (-17));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3354");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 3, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3356");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3357");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("ihhh!hhh!hhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3358");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("ihhh!hhh!hhihhh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh!hh" + "'", str1, "ihhh!hhh!hhihhh!hh");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3359");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3360");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3361");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh", (java.lang.CharSequence) "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3362");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hi!i!!hi!i", (java.lang.CharSequence) "hhh!hhh!hhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3363");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "ihhh!hhh!hhihhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3364");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        char[] charArray9 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray9, (-87));
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3365");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("ihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3366");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        comp5111.assignment.cut.Subject.StringTasks stringTasks2 = new comp5111.assignment.cut.Subject.StringTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) stringTasks2, (int) (byte) -1);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, (short) 0, true };
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray13 = new int[] { 10 };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, (java.lang.Object) boolean17, (-9));
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean17, (int) (short) 100);
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (int) (byte) 0);
        char[] charArray28 = new char[] {};
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray28);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray28, 97);
        char[] charArray42 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray42);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray42);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray42);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray42);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray42);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray42);
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray42, (int) '4');
        int[] intArray55 = new int[] { 6, (-45), (-11), 65 };
        boolean boolean56 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray55);
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray55, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[6, -45, -11, 65]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3367");
        char[] charArray6 = new char[] { '\n', 'a' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3368");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhh!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3370");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!hhh!hi", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3372");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3373");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3374");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-87), 31, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3375");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!", (java.lang.CharSequence) "hh!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3376");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ii" + "'", str1, "ii");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3378");
        char[] charArray13 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!hi!i!hi!i!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhi", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3379");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!hhh!h", "ihhh!hhh!hhihhh!hhh!hh", "hh!!i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh!h" + "'", str3, "hhh!hhh!h");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3380");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ihhh!hhh!hhihhh", "iii", "hh!!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihhh!hhh!hhihhh" + "'", str3, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3381");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3382");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hhh!h", (java.lang.CharSequence) "h!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3383");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), 10, 15);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3384");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhh!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3385");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-20), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3386");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!!hi!i!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hi!i!!h" + "'", str1, "hh!!hi!i!!h");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3387");
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!hi!i!hi!i!", charArray14);
        java.lang.Class<?> wildcardClass24 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3388");
        char[] charArray8 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hi!h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3389");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3390");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ii", "hi!i!hi!i!hi!", "hhh!hhh!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ii" + "'", str3, "ii");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3391");
        char[] charArray7 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "iii", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3392");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hi!i!hi!i!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3393");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("ihhh!hhh!hhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ihhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3394");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "ihhh!hhh!hhihhh!", (java.lang.CharSequence) "ii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3395");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3396");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("ihhh!hhh!hhihhh", "hi!i!", "ihhh!hhh!hhihhh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihhh!hhh!hhihhh" + "'", str3, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3397");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!hi!i!!hi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3398");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh!", (java.lang.CharSequence) "hh!!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3399");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "ihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3400");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3401");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        char[] charArray16 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray16);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean21, (-10));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3402");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-35), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3403");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(101, (-32), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3404");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("ihhh!hhh!hhihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh" + "'", str1, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3405");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3406");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray4);
        char[] charArray10 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray10, (-87));
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!h!hhh", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3407");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("ihhh!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character i is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3408");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!!hi!i!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hi!i!!h" + "'", str1, "hh!!hi!i!!h");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3409");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hh!!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3412");
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray8);
        char[] charArray14 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray14, (-87));
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hi!hi", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray14);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hhh!hi", charArray14);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3413");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3414");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', (int) (short) 100, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3415");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 100, (int) (short) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) strArray13, 999999999);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) strArray13, (int) '\n');
        java.lang.String[] strArray20 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray20);
        char[] charArray26 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray20, (java.lang.Object) charArray26, (-87));
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray26);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray26, (int) '\n');
        char[] charArray44 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray44);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray44);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray44);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean52 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhh!hhihhh!", charArray44);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) boolean53, 6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3416");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3417");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3418");
        char[] charArray16 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i!i", charArray16);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!h", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3419");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3420");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("ihhh!hhh!hhihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihhh" + "'", str1, "ihhh!hhh!hhihhh");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3421");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-100), (-87), (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3422");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!i!", "hh!!i!", "hh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!" + "'", str3, "hh!!");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3423");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhh!hhihhh!!i!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3424");
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i", charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i!hi!i!hi!i!", charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!h!hh", charArray15);
        java.lang.Class<?> wildcardClass26 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3425");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3426");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("ihhh!hhh!hhihhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3427");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "ihhh!hhh!hhihhh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3428");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) -1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3429");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray11 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray11, (-87));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hhh!hh", charArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3430");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(39, 16, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3431");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("ihhh!hhh!hhihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhh!hhh!hhihh" + "'", str1, "ihhh!hhh!hhihh");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3432");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3433");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) ' ', (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3434");
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray6);
        char[] charArray12 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray12, (-87));
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!h!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hi!h", charArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3435");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3436");
        char[] charArray11 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3437");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!hhi!!", "hi!i!hi!i!hi!", "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hhi!!" + "'", str3, "hhi!hhi!!");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3438");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("ihhh!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3439");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi" + "'", str2, "hhi");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3440");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(85, (-32), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3442");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3443");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!!hi!i!!hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hi!i!!hi!i!" + "'", str1, "hh!!hi!i!!hi!i!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3444");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!i!hi!i!hi!", (java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3445");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!", "i!i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3446");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hi!", "hi!i!i!hi!i!i!hi!i!i!", "hh!!hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hi!" + "'", str3, "hh!!hi!");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3447");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3448");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!i!i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi", charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3449");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!i!i!");
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray6);
        char[] charArray12 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray12, (-87));
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 30);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!", charArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3450");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3451");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!i!i!hi!i!i!hi!i!ihi!i!i!hi!i!i!hi!i!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3452");
        char[] charArray16 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray16);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!hhi!!", charArray16);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3453");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!hhh!hhh", (java.lang.CharSequence) "hi!i!hi!i!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3454");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3455");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", 999999999);
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray15, (int) (short) -1);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!i!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        java.lang.Class<?> wildcardClass24 = charArray15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3456");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3457");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), (-90), (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3458");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3459");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!i!hi!i!hi!i!", "ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!hi!i!hi!i!" + "'", str2, "hi!i!hi!i!hi!i!");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3460");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "ii", (java.lang.CharSequence) "h!h!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3461");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!hhh!hh", "hi!i!i!hi!i!i!hi!i!i", "hhh!hhh!hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh!hh" + "'", str3, "hhh!hhh!hh");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3462");
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i", charArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3463");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("iii", "hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iii" + "'", str2, "iii");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3464");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(90, (int) ' ', (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3465");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hi!h", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!hhh!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3466");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!!hhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!!hhh!h is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3468");
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i", charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhihhh!", charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3469");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray4, 999999999);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3470");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!", "hi!i!i!hi!i!i!hi!i!i!", "ihhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhhhh!hhh!hhh!hhhhhh!hhhihhh!hhhhhh!hhhhhh!hhh!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!" + "'", str3, "i!");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3471");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hh!" + "'", str1, "hh!!hh!");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("h!h!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!h!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3473");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3474");
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i!i", charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!hhh!hhh!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ihhh!hhh!hhihhh!hhh!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3475");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hi!i!hi!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3476");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!hhh!h", "hhhi!", "i!i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh!h" + "'", str3, "hhh!hhh!h");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3478");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3479");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '#', 1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3480");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhh!hhh!h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!i!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3481");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hh!!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3482");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "ihhh!hhh!hhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!!hi!i!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!!hi!i!!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3484");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(90, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3485");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hi!i!i!hi!i!i!hi!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3486");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-97), 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3487");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\n', (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3488");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(62, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3489");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3490");
        char[] charArray16 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!i", charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!hhi!!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!hhh!h", charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3491");
        char[] charArray7 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray7);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!hhh!hi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3492");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("ihhh!hhh!hhihhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3493");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!hi!i!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3494");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!hi!i!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3495");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), (int) (short) -1, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3496");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhh!hhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3497");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3498");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-35), (-22), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3499");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("i!");
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hi!hi", charArray15);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray15, 3);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!h!", charArray15);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test6.test3500");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!i" + "'", str1, "hh!!i");
    }

}

