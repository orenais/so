/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:26:39 GMT 2016
 */

package org.openecomp.mso;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoStatusUtilESTest extends MsoStatusUtilESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoStatusUtil msoStatusUtil0 = new MsoStatusUtil();
      boolean boolean0 = msoStatusUtil0.getSiteStatus("getSiteStatus");
      assertFalse(boolean0);
  }
}
