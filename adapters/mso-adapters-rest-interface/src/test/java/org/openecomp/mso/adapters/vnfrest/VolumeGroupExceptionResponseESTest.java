/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:27:29 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.openstack.exceptions.MsoExceptionCategory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class VolumeGroupExceptionResponseESTest extends VolumeGroupExceptionResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VolumeGroupExceptionResponse volumeGroupExceptionResponse0 = new VolumeGroupExceptionResponse();
      assertNull(volumeGroupExceptionResponse0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.USERDATA;
      VolumeGroupExceptionResponse volumeGroupExceptionResponse0 = new VolumeGroupExceptionResponse("L", msoExceptionCategory0, false, "M4");
      assertEquals("L", volumeGroupExceptionResponse0.getMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VolumeGroupExceptionResponse volumeGroupExceptionResponse0 = new VolumeGroupExceptionResponse("M4");
      assertNull(volumeGroupExceptionResponse0.getCategory());
  }
}
