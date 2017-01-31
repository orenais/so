/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 10:52:03 GMT 2016
 */

package org.openecomp.mso.adapters.vnf.async.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoExceptionCategoryESTest extends MsoExceptionCategoryESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoExceptionCategory[] msoExceptionCategoryArray0 = MsoExceptionCategory.values();
      assertNotNull(msoExceptionCategoryArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.valueOf("INTERNAL");
      assertEquals(MsoExceptionCategory.INTERNAL, msoExceptionCategory0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MsoExceptionCategory.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        MsoExceptionCategory.valueOf("sm%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.openecomp.mso.adapters.vnf.async.client.MsoExceptionCategory.sm%
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        MsoExceptionCategory.fromValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        MsoExceptionCategory.fromValue("'E'J4$ovJ-=|?p<o5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.openecomp.mso.adapters.vnf.async.client.MsoExceptionCategory.'E'J4$ovJ-=|?p<o5
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.IO;
      String string0 = msoExceptionCategory0.value();
      assertEquals("IO", string0);
  }
}
