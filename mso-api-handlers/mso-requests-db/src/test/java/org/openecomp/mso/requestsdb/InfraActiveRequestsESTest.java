/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 14 15:13:40 GMT 2016
 */

package org.openecomp.mso.requestsdb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.openecomp.mso.requestsdb.InfraActiveRequests;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class InfraActiveRequestsESTest extends InfraActiveRequestsESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InfraActiveRequests infraActiveRequests0 = new InfraActiveRequests();
      assertNull(infraActiveRequests0.getVolumeGroupId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InfraActiveRequests infraActiveRequests0 = new InfraActiveRequests("#)r", "#)r");
      assertNull(infraActiveRequests0.getNetworkName());
  }
}
