/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:14:33 GMT 2016
 */

package org.openecomp.mso.adapters.tenantrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.entity.MsoRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TenantRollbackESTest extends TenantRollbackESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.setTenantId("e'W6mm;1{:,");
      tenantRollback0.getTenantId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      assertFalse(tenantRollback0.getTenantCreated());
      
      tenantRollback0.setTenantCreated(true);
      boolean boolean0 = tenantRollback0.getTenantCreated();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.setCloudId("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<rollbackTenantRequest>\n    <tenantCreated>false</tenantCreated>\n</rollbackTenantRequest>\n");
      tenantRollback0.getCloudId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.setCloudId("");
      tenantRollback0.getCloudId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.getMsoRequest();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      boolean boolean0 = tenantRollback0.getTenantCreated();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.getCloudId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.getTenantId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      MsoRequest msoRequest0 = new MsoRequest();
      tenantRollback0.setMsoRequest(msoRequest0);
      tenantRollback0.getMsoRequest();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      tenantRollback0.setTenantId("");
      tenantRollback0.getTenantId();
      assertFalse(tenantRollback0.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TenantRollback tenantRollback0 = new TenantRollback();
      String string0 = tenantRollback0.toString();
      assertEquals("VnfRollback: cloud=null, tenant=null, tenantCreated=false", string0);
  }
}
