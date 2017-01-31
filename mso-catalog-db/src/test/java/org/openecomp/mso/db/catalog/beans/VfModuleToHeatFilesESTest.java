/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:18:06 GMT 2016
 */

package org.openecomp.mso.db.catalog.beans;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class VfModuleToHeatFilesESTest extends VfModuleToHeatFilesESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setVfModuleId(1842);
      VfModuleToHeatFiles vfModuleToHeatFiles1 = new VfModuleToHeatFiles();
      boolean boolean0 = vfModuleToHeatFiles0.equals(vfModuleToHeatFiles1);
      assertEquals(1842, vfModuleToHeatFiles0.getVfModuleId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setVfModuleId((-999));
      int int0 = vfModuleToHeatFiles0.getVfModuleId();
      assertEquals((-999), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setHeatFilesId(3619);
      int int0 = vfModuleToHeatFiles0.getHeatFilesId();
      assertEquals(3619, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setHeatFilesId((-1390));
      int int0 = vfModuleToHeatFiles0.getHeatFilesId();
      assertEquals((-1390), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      VfModuleToHeatFiles vfModuleToHeatFiles1 = new VfModuleToHeatFiles();
      boolean boolean0 = vfModuleToHeatFiles0.equals(vfModuleToHeatFiles1);
      assertTrue(boolean0);
      assertEquals(0, vfModuleToHeatFiles1.getVfModuleId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      VfModuleToHeatFiles vfModuleToHeatFiles1 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setVfModuleId((-232));
      boolean boolean0 = vfModuleToHeatFiles0.equals(vfModuleToHeatFiles1);
      assertEquals(-232, vfModuleToHeatFiles0.getVfModuleId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      Object object0 = new Object();
      boolean boolean0 = vfModuleToHeatFiles0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      boolean boolean0 = vfModuleToHeatFiles0.equals(vfModuleToHeatFiles0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      int int0 = vfModuleToHeatFiles0.getHeatFilesId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      int int0 = vfModuleToHeatFiles0.getVfModuleId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      String string0 = vfModuleToHeatFiles0.toString();
      assertEquals("VF_MODULE_ID=0, HEAT_FILES_ID=0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setHeatFilesId((-1));
      vfModuleToHeatFiles0.hashCode();
      assertEquals(-1, vfModuleToHeatFiles0.getHeatFilesId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VfModuleToHeatFiles vfModuleToHeatFiles0 = new VfModuleToHeatFiles();
      vfModuleToHeatFiles0.setVfModuleId(1);
      int int0 = vfModuleToHeatFiles0.getVfModuleId();
      assertEquals(1, int0);
  }
}
