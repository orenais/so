/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:52:37 GMT 2016
 */

package org.openecomp.mso.openstack.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoNetworkAlreadyExistsESTest extends MsoNetworkAlreadyExistsESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoNetworkAlreadyExists msoNetworkAlreadyExists0 = new MsoNetworkAlreadyExists((String) null, (String) null, (String) null);
      assertNull(msoNetworkAlreadyExists0.getContext());
  }
}
