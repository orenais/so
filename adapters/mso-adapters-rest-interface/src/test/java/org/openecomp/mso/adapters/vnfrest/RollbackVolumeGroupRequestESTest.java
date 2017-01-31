/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:23:56 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RollbackVolumeGroupRequestESTest extends RollbackVolumeGroupRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RollbackVolumeGroupRequest rollbackVolumeGroupRequest0 = new RollbackVolumeGroupRequest();
      rollbackVolumeGroupRequest0.setVolumeGroupRollback((VolumeGroupRollback) null);
      assertNull(rollbackVolumeGroupRequest0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RollbackVolumeGroupRequest rollbackVolumeGroupRequest0 = new RollbackVolumeGroupRequest();
      VolumeGroupRollback volumeGroupRollback0 = rollbackVolumeGroupRequest0.getVolumeGroupRollback();
      assertNull(volumeGroupRollback0);
  }
}
