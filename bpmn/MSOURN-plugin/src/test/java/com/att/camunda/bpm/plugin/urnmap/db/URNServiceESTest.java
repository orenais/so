/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 13:47:07 GMT 2016
 */

package com.att.camunda.bpm.plugin.urnmap.db;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class URNServiceESTest extends URNServiceESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URNService uRNService0 = new URNService();
      // Undeclared exception!
      try { 
        uRNService0.getProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.att.camunda.bpm.plugin.urnmap.db.URNService", e);
      }
  }
}
