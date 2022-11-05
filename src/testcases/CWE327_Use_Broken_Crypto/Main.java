package testcases.CWE327_Use_Broken_Crypto;

import testcasesupport.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java testcasesupport.Main testcases.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference.custom_function.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference__custom_function_01 testcases.CWE481_Assigning_instead_of_Comparing.bool.CWE481_Assigning_instead_of_Comparing__bool_01");
				System.exit(1);
			}
			
			/* User supplied some class names on the command line, just use those with introspection
			 *
			 * String classNames[] = { "CWE481_Assigning_instead_of_Comparing__boolean_01",
			 *		"CWE476_Null_Pointer_Dereference__getProperty_01" };
 			 * could read class names from command line or use
			 * http://sadun-util.sourceforge.net/api/org/sadun/util/
			 * ClassPackageExplorer.html
			 */

			for (String className : args) {

				try {
					
					/* String classNameWithPackage = "testcases." + className; */
					
					/* IO.writeLine("classNameWithPackage = " + classNameWithPackage); */

					Class<?> myClass = Class.forName(className);

					AbstractTestCase myObject = (AbstractTestCase) myClass
							.newInstance();

					myObject.runTest(className);

				} catch (Exception ex) {

					IO.writeLine("Could not run test for class " + className);
					ex.printStackTrace();

				}
				
				IO.writeLine(""); /* leave a blank line between classes */

			}

		} else {
		
			/* No command line args were used, we want to run every testcase */
			
			/* needed to separate these calls into other methods because
			   we were running into the size limit Java has for a single method */
			runTestCWE1();
			runTestCWE2();
			runTestCWE3();
			runTestCWE4();
			runTestCWE5();
			runTestCWE6();
			runTestCWE7();
			runTestCWE8();
			runTestCWE9();
		}			
	}

private static void runTestCWE1() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-1 */

			/* END-AUTOGENERATED-JAVA-TESTS-1 */
}

private static void runTestCWE2() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-2 */

			/* END-AUTOGENERATED-JAVA-TESTS-2 */
}

private static void runTestCWE3() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-3 */
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_01()).runTest("CWE327_Use_Broken_Crypto__3DES_01");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_02()).runTest("CWE327_Use_Broken_Crypto__3DES_02");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_03()).runTest("CWE327_Use_Broken_Crypto__3DES_03");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_04()).runTest("CWE327_Use_Broken_Crypto__3DES_04");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_05()).runTest("CWE327_Use_Broken_Crypto__3DES_05");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_06()).runTest("CWE327_Use_Broken_Crypto__3DES_06");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_07()).runTest("CWE327_Use_Broken_Crypto__3DES_07");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_08()).runTest("CWE327_Use_Broken_Crypto__3DES_08");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_09()).runTest("CWE327_Use_Broken_Crypto__3DES_09");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_10()).runTest("CWE327_Use_Broken_Crypto__3DES_10");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_11()).runTest("CWE327_Use_Broken_Crypto__3DES_11");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_12()).runTest("CWE327_Use_Broken_Crypto__3DES_12");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_13()).runTest("CWE327_Use_Broken_Crypto__3DES_13");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_14()).runTest("CWE327_Use_Broken_Crypto__3DES_14");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_15()).runTest("CWE327_Use_Broken_Crypto__3DES_15");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_16()).runTest("CWE327_Use_Broken_Crypto__3DES_16");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__3DES_17()).runTest("CWE327_Use_Broken_Crypto__3DES_17");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_01()).runTest("CWE327_Use_Broken_Crypto__DES_01");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_02()).runTest("CWE327_Use_Broken_Crypto__DES_02");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_03()).runTest("CWE327_Use_Broken_Crypto__DES_03");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_04()).runTest("CWE327_Use_Broken_Crypto__DES_04");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_05()).runTest("CWE327_Use_Broken_Crypto__DES_05");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_06()).runTest("CWE327_Use_Broken_Crypto__DES_06");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_07()).runTest("CWE327_Use_Broken_Crypto__DES_07");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_08()).runTest("CWE327_Use_Broken_Crypto__DES_08");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_09()).runTest("CWE327_Use_Broken_Crypto__DES_09");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_10()).runTest("CWE327_Use_Broken_Crypto__DES_10");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_11()).runTest("CWE327_Use_Broken_Crypto__DES_11");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_12()).runTest("CWE327_Use_Broken_Crypto__DES_12");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_13()).runTest("CWE327_Use_Broken_Crypto__DES_13");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_14()).runTest("CWE327_Use_Broken_Crypto__DES_14");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_15()).runTest("CWE327_Use_Broken_Crypto__DES_15");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_16()).runTest("CWE327_Use_Broken_Crypto__DES_16");
			(new testcases.CWE327_Use_Broken_Crypto.CWE327_Use_Broken_Crypto__DES_17()).runTest("CWE327_Use_Broken_Crypto__DES_17");
			/* END-AUTOGENERATED-JAVA-TESTS-3 */
}

private static void runTestCWE4() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-4 */

			/* END-AUTOGENERATED-JAVA-TESTS-4 */
}

private static void runTestCWE5() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-5 */

			/* END-AUTOGENERATED-JAVA-TESTS-5 */
}

private static void runTestCWE6() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-6 */

			/* END-AUTOGENERATED-JAVA-TESTS-6 */
}

private static void runTestCWE7() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-7 */

			/* END-AUTOGENERATED-JAVA-TESTS-7 */
}

private static void runTestCWE8() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-8 */

			/* END-AUTOGENERATED-JAVA-TESTS-8 */
}

private static void runTestCWE9() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

			/* END-AUTOGENERATED-JAVA-TESTS-9 */
}
}