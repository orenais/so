/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:15:37 GMT 2016
 */

package org.openecomp.mso.adapters.nwrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.openstack.beans.NetworkRollback;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RollbackNetworkRequestESTest extends RollbackNetworkRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RollbackNetworkRequest rollbackNetworkRequest0 = new RollbackNetworkRequest();
      NetworkRollback networkRollback0 = new NetworkRollback();
      rollbackNetworkRequest0.setNetworkRollback(networkRollback0);
      networkRollback0.setNetworkCreated(true);
      NetworkRollback networkRollback1 = rollbackNetworkRequest0.getNetworkRollback();
      assertNull(networkRollback1.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RollbackNetworkRequest rollbackNetworkRequest0 = new RollbackNetworkRequest();
      NetworkRollback networkRollback0 = new NetworkRollback();
      rollbackNetworkRequest0.setNetworkRollback(networkRollback0);
      NetworkRollback networkRollback1 = rollbackNetworkRequest0.getNetworkRollback();
      assertNull(networkRollback1.getNeutronNetworkId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RollbackNetworkRequest rollbackNetworkRequest0 = new RollbackNetworkRequest();
      NetworkRollback networkRollback0 = rollbackNetworkRequest0.getNetworkRollback();
      assertNull(networkRollback0);
  }
}
