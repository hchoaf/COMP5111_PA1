package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_1_Test2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1001");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1002");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1003");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(25, 84, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1004");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1005");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1006");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(90, (-10), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1007");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1008");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1009");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, (-90), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1011");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh", "hh!", "h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh" + "'", str3, "hhh");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1012");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!", "hhh!", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1013");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1014");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1015");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1016");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1017");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1018");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(22, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1020");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1021");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1022");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1023");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1024");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h!", "i", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!" + "'", str3, "h!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1025");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(62, (-20), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1026");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh" + "'", str1, "hhh");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1027");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1029");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1031");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1032");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1033");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi" + "'", str2, "hhi");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1034");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\n', ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1035");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1036");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare(' ', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1037");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh", "hhhi", "!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh" + "'", str3, "hhh");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1038");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1039");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!", "hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1040");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h!", "hhh", "h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!" + "'", str3, "h!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1041");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!i", "hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1043");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(999999999, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1044");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) 'a', 0, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1045");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (short) 0, 999999999);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-9), 999999999);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, obj10, (int) (byte) 1);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) "hhh!", (int) (byte) 100);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhh!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1046");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1047");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1048");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1049");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1051");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1052");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1053");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), (int) (byte) 1, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1055");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (short) 0, 999999999);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-9), 999999999);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj14 = null;
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, obj14, (int) '\r');
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) '\r', (int) (byte) 10);
        char[] charArray28 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray28);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray28);
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) boolean32, (int) '\000');
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean32, (-42));
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int36, 25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1057");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hi", "hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1058");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i", "hh", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i" + "'", str3, "i!i");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1059");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1060");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1061");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) '\n');
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj6, (-101));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1062");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1063");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), 97, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1064");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "!", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1065");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, (int) '\n', 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1066");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1067");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhh");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 100);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray6);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        java.lang.Class<?> wildcardClass9 = subject8.getClass();
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) subject8, 35);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 35, 25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1068");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1069");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1070");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1071");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (-35), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1072");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1073");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1074");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1076");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!" + "'", str2, "h!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1077");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 1, 22, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1078");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1079");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-25), (int) '#', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(52, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1081");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1082");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 30, (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1083");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\r', '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1084");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-9), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1086");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-99), 84, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1087");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, 5, 9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1088");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1089");
        char[] charArray9 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1090");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(3, 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1091");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(17, (-25), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1092");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "h!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1093");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hh!", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1094");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi" + "'", str1, "hhhi");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1095");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1096");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-42));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1097");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1098");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hi!", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh" + "'", str3, "hh");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1101");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1102");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-62), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1103");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1104");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh", "hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1105");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "i!i", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1106");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h!", (java.lang.CharSequence) "hhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1107");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1108");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) -1, (int) (byte) -1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1110");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1111");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1112");
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1113");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, 999999999, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1114");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i" + "'", str1, "i!i");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1115");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        java.lang.Class<?> wildcardClass1 = subject0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1116");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1117");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1118");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\r', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1119");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(6, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1120");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi", "hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-20), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1122");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '#', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1123");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!", "hhh", "hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i!" + "'", str3, "hi!i!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1124");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int[] intArray3 = new int[] { 10 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean6, (int) '\r');
        java.lang.Class<?> wildcardClass9 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1125");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1126");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1127");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1128");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-19));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1129");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, 20, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1130");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi" + "'", str1, "hhhi");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1131");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1132");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(84, (-65), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1133");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1134");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh!", "hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1135");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!", "hi!i!", "h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!" + "'", str3, "hhh!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1136");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1137");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\r');
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "", 100);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) int9, (int) (byte) 10);
        comp5111.assignment.cut.Subject.GregorianTasks gregorianTasks12 = new comp5111.assignment.cut.Subject.GregorianTasks();
        java.lang.Class<?> wildcardClass13 = gregorianTasks12.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) wildcardClass13, (int) (byte) 0);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) 7, 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1138");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i" + "'", str1, "hi!i");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1139");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-10), (int) (byte) 1, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1140");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 1, (-32), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1141");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1142");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1143");
        int[] intArray4 = new int[] { 6, (-45), (-11), 65 };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, -45, -11, 65]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1144");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1145");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1146");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('a', '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1147");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1148");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1150");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1151");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", 999999999);
        char[] charArray13 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, (int) (short) -1);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1152");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray15 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1153");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100, (short) 0, true };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray8 = new int[] { 10 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) boolean12, (-9));
        char[] charArray23 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray23);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray23);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) boolean27, (int) (byte) 10);
        java.lang.Class<?> wildcardClass30 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1154");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, 6, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(17, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1156");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), 7, (int) (byte) 1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1157");
        char[] charArray9 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1158");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
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
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1159");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi");
        int[] intArray5 = new int[] { (-90), 0, 0 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean9, (int) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-90, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1160");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray4, 999999999);
        char[] charArray15 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, 0);
        java.lang.Class<?> wildcardClass21 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1161");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1162");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1163");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\n', ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1164");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), 0, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1165");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1166");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '4', '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1167");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) -1, (-1), (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1168");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int[] intArray4 = new int[] { (-90), 0, 0 };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) boolean5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-90, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1169");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1171");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i!", "hi!i", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!" + "'", str3, "hh!!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "i", "hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1173");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1174");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, (-62), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1176");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-22), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\r', (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1178");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1179");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i", "hh", "hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i" + "'", str3, "hi!i");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1181");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, (int) (byte) 1, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1182");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1183");
        java.lang.Object[] objArray0 = null;
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
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) boolean21, 100);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1184");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\r', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1185");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1186");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1187");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, 90, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1188");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1189");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\000', 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1190");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(11, (-35), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1191");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1192");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-99), (int) ' ', (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1193");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!" + "'", str1, "hi!i!");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1194");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1195");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh!", "hhh", "i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!" + "'", str3, "i!i!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1196");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
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
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1197");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i", (java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1198");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-32), 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1199");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 100, (-99), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1200");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1201");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1202");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1203");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1204");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1205");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(52, (int) ' ', 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1206");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(84, (int) (short) 0, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1207");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1208");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1209");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(13, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1211");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!" + "'", str1, "i!i!");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1212");
        char[] charArray4 = new char[] { '\n', 'a' };
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray4);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1213");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!i!", "hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i" + "'", str2, "i!i");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1214");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-10));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1216");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1217");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!", "hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!" + "'", str2, "hh!!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1218");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(45, 30, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1219");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1220");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1222");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1223");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1224");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "h", "i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i!i!" + "'", str3, "i!i!i!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1225");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) '\n');
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray7);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray7);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray12);
        char[] charArray18 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) charArray18, (-87));
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray18, 30);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray7, 7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1226");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!", "h", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hhi!!" + "'", str3, "hhi!hhi!!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1227");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1228");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        comp5111.assignment.cut.Subject.StringTasks stringTasks7 = new comp5111.assignment.cut.Subject.StringTasks();
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) stringTasks7, (int) (byte) -1);
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100, (short) 0, true };
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray13, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray18 = new int[] { 10 };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray13, (java.lang.Object) boolean22, (-9));
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) boolean22, (int) (short) 100);
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "hi", (int) (byte) 0);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1229");
        int[] intArray1 = new int[] { 31 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[31]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1230");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1231");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength(obj2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1232");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1233");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', 101, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1234");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-42), 0, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1235");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1236");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1237");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1239");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1240");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1241");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1243");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        char[] charArray9 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray9, (-87));
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1244");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1245");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hi!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1246");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) ' ');
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj8, 0);
        char[] charArray18 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean22, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1247");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "", "hhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi" + "'", str3, "hhhi");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1248");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1249");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1250");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1251");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(100, (-99), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1252");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!", (java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1254");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1255");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character i is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1256");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!", "hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1257");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) ' ', ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1260");
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1261");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1262");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1263");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 1, (-62), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1264");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1265");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i", "hh!", "h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i" + "'", str3, "i!i");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1266");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 0, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1267");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1269");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\r', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1270");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(3, 13, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1271");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1272");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1273");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1274");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1275");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1276");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1277");
        char[] charArray9 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1278");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1279");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1280");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1281");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhh");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1282");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-3), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1283");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1284");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1285");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1286");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(11, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1287");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '4', (int) (byte) 1, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1288");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i" + "'", str1, "i!i!i");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1290");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!", (java.lang.CharSequence) "i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1291");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!", "hhi!hhi!!", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!" + "'", str3, "hhi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1292");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "h!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1293");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1294");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i!", "i!i", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1296");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "i!", "hh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1297");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-32), 13, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1298");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '4', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1299");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1300");
        char[] charArray6 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1301");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-87), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1303");
        comp5111.assignment.cut.Subject.NumberTasks numberTasks0 = new comp5111.assignment.cut.Subject.NumberTasks();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) numberTasks0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1304");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1305");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1306");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh" + "'", str3, "hh");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1307");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(42, 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1308");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1309");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1310");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh!", (java.lang.CharSequence) "i!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1311");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1312");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1313");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!", (java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1314");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i", "i!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1315");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi", (java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1316");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) ' ', (int) '\n', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1318");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!i!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1319");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!i", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean17);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1320");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(999999999, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1322");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = new char[] {};
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1323");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1324");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1325");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1327");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1328");
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
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray35);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1329");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1330");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi", "i!i!", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi" + "'", str3, "hhi");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1331");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("i!i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1333");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, (-22), (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1334");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, (-87), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1335");
        char[] charArray8 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1336");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1337");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, (-52), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1338");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("i!i!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1339");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("i!i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1340");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!", (java.lang.CharSequence) "hi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1341");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', (int) '#', 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1342");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1343");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1344");
        char[] charArray5 = new char[] { '\n', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1345");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1346");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(1, 90, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1347");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character i is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1348");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1349");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1352");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh!", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh!" + "'", str2, "hhh!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1353");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1354");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1355");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1356");
        char[] charArray8 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1357");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!" + "'", str1, "hi!i!");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1358");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!i", "hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1359");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), (-9), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1361");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhh!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1362");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1363");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!", "hh!", "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1364");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\000', 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1365");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh" + "'", str2, "hhh");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1366");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1367");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1368");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1369");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh");
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
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int25, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1370");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "i!i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1371");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1372");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1373");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1374");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!hhi!!", "hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1375");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-52), (-13), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1376");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1377");
        char[] charArray12 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1378");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(7, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1379");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1380");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1381");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1382");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-39), (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1383");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i", "h", "hh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!i!i" + "'", str3, "hh!!i!i");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1384");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hhh!", "i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1385");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(45, 101, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1386");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!i", "hi!", "hh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!i" + "'", str3, "i!i");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1387");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-100), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1388");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("i!i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1389");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhh", "h", "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iii" + "'", str3, "iii");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1390");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!i!", "hh!!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1391");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(999999999);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1392");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1393");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 100, 1.0d, 10.0f, true };
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray5, (java.lang.Object) 999999999, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 100, 1.0, 10.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 100, 1.0, 10.0, true]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1394");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("iii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character i is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1395");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1396");
        char[] charArray10 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1397");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int16, 0);
        char[] charArray28 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray28);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray28);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray28);
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", 17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1398");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(84);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1399");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\n', (-39), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1400");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h!", (java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1401");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!i", "hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i" + "'", str2, "i!i");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1402");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1403");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "i!i!i!", "hhi!hhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1404");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!");
        char[] charArray6 = new char[] { 'a', ' ', '\000', '\n' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean8, 97);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a \000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a \000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  , \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1405");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1406");
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1407");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1408");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i", "iii", "hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i" + "'", str3, "hi!i");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1409");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1410");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!" + "'", str1, "h!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1411");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1412");
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
        java.lang.CharSequence charSequence21 = null;
        char[] charArray35 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray35);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray35);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray35);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence21, charArray35);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean43, 100);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1413");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1414");
        char[] charArray9 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1416");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(30, 25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1417");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1418");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!i!", "hhh!", "hh!!i!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i!" + "'", str3, "hi!i!");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1420");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!i!i!", (java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1421");
        char[] charArray14 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!i", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray14);
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
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1422");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', (-35), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1423");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1424");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1425");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!i!i", "i", "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hi!hi" + "'", str3, "hh!!hi!hi");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1426");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1427");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) ' ');
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj8, 0);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!i");
        java.lang.Object obj15 = null;
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, obj15, (int) (byte) 1);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) int17, (int) (byte) 1);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int19, (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1428");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1429");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(9, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1430");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hi!hi", "i!", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hhh!hi" + "'", str3, "hh!!hhh!hi");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1431");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!i", (java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1432");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(19, (int) (byte) 10, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1433");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1434");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hh!!i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1435");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!" + "'", str1, "hh!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1436");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "iii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1437");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "iii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1438");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1439");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!!hhh!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1440");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1441");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1442");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!hhh!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hh!!hhh!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hhh!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1444");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!hhi!!", "i!i!i!", "hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hhi!!" + "'", str3, "hhi!hhi!!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1446");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hh!!hhh!hi", "hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1447");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!!" + "'", str1, "hhi!hhi!!");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1448");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-101), 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1449");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(100, 42, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1450");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1451");
        java.lang.Object[] objArray0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray10, (-99));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1452");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), (-32), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1453");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '#', (-52), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1454");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("iii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1455");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1456");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(19, (int) '4', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1457");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!!hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1458");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1459");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1460");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("iii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1461");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-999999999), (-10), 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1462");
        java.lang.Object[] objArray0 = null;
        char[] charArray10 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray10, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("i!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: i!i!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1464");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i", (java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1465");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!" + "'", str1, "i!i!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1466");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1467");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!i", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1468");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!i!", (java.lang.CharSequence) "iii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1469");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!!hhh!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1470");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!", "hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("i!i!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!i!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1472");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(13, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1473");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1474");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, (-87), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1476");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) -1, (-62), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1477");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hhh!hi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1478");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100, (short) 0, true };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) 1.0d, (int) ' ');
        int[] intArray8 = new int[] { 10 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) boolean12, (-9));
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100, 0, true]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("iii", "i", "hhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!hhh!hhh!" + "'", str3, "hhh!hhh!hhh!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1480");
        char[] charArray5 = new char[] { '\n', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1481");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-11), (int) (byte) -1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1482");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhh!hhh!hhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1483");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "iii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1484");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 97, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1485");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1486");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1487");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("i!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1488");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1489");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-999999999), 0, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1490");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 100, (int) (short) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) strArray13, 999999999);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) strArray13, (int) '\n');
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray19);
        java.lang.String[] strArray22 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) strArray22, 999999999);
        char[] charArray34 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhh", charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray34);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) int40, 62);
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, (java.lang.Object) int40, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1491");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hi!hi", "i", "i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hi!i!!hi!i!" + "'", str3, "hh!!hi!i!!hi!i!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1493");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray11 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        java.lang.Class<?> wildcardClass13 = charArray11.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray11, (int) (byte) 100);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray17, (java.lang.Object) (short) 0, 999999999);
        java.lang.Class<?> wildcardClass21 = strArray17.getClass();
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass21, 99);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-25));
        char[] charArray36 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray36);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray36);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "i", (-22));
        // The following exception was thrown during execution in test generation
        try {
            int int43 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1494");
        char[] charArray7 = new char[] { '\r', '4', '4', '\n', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Object obj14 = null;
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, obj14, (int) '\r');
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) '\r', (int) (byte) 10);
        char[] charArray28 = new char[] { '\n', '\n', 'a', '\n', 'a', '\000' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray28);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray28);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray28);
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) boolean32, (int) '\000');
        java.lang.Object[] objArray35 = new java.lang.Object[] { boolean9, boolean32 };
        java.lang.Object obj36 = null;
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray35, obj36, (-87));
        java.lang.Class<?> wildcardClass39 = objArray35.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r44\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, 4, 4, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\n\na\na\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, \n, a, \n, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[false, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[false, false]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1495");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-52), 97, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1496");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("i!i!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1497");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-101));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1498");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1499");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test2..test1500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("iii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"iii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }
}

