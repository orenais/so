/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:10:06 GMT 2016
 */

package org.openecomp.mso.properties;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoPropertiesExceptionESTest extends MsoPropertiesExceptionESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoPropertiesException msoPropertiesException0 = new MsoPropertiesException("");
      MsoPropertiesException msoPropertiesException1 = new MsoPropertiesException("l6G(", (Throwable) msoPropertiesException0);
      assertFalse(msoPropertiesException1.equals((Object)msoPropertiesException0));
  }
}
