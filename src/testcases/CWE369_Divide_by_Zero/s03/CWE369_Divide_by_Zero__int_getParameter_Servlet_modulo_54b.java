/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_getParameter_Servlet_modulo_54b.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: getParameter_Servlet Read data from a querystring using getParameter()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE369_Divide_by_Zero.s03;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE369_Divide_by_Zero__int_getParameter_Servlet_modulo_54b
{
    public void badSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_getParameter_Servlet_modulo_54c()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_getParameter_Servlet_modulo_54c()).goodG2BSink(data , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_getParameter_Servlet_modulo_54c()).goodB2GSink(data , request, response);
    }
}
