/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 25 13:38:29 GMT 2016
 */

package org.openecomp.mso.asdc;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.PrivateAccess;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ASDCControllerSingletonESTest extends ASDCControllerSingletonESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASDCControllerSingleton aSDCControllerSingleton0 = new ASDCControllerSingleton();
      PrivateAccess.callMethod((Class<ASDCControllerSingleton>) ASDCControllerSingleton.class, aSDCControllerSingleton0, "setWorking", (Object) true, (Class<?>) boolean.class);
      aSDCControllerSingleton0.periodicControllerTask();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASDCControllerSingleton aSDCControllerSingleton0 = new ASDCControllerSingleton();
      Object object0 = PrivateAccess.callMethod((Class<ASDCControllerSingleton>) ASDCControllerSingleton.class, aSDCControllerSingleton0, "terminate");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASDCControllerSingleton aSDCControllerSingleton0 = new ASDCControllerSingleton();
      aSDCControllerSingleton0.periodicControllerTask();
  }
}
