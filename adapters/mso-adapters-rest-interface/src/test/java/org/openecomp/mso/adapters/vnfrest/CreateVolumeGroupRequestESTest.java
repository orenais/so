/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:25:19 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.entity.MsoRequest;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CreateVolumeGroupRequestESTest extends CreateVolumeGroupRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      assertNull(createVolumeGroupRequest0.getVnfVersion());
      
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      MsoRequest msoRequest0 = createVolumeGroupRequest1.getMsoRequest();
      createVolumeGroupRequest0.setMsoRequest(msoRequest0);
      Boolean boolean0 = new Boolean(true);
      createVolumeGroupRequest0.toXmlString();
      createVolumeGroupRequest0.setVnfVersion("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<createVolumeGroupRequest>\n    <msoRequest/>\n    <volumeGroupParams/>\n</createVolumeGroupRequest>\n");
      Boolean.compare(true, false);
      createVolumeGroupRequest0.setFailIfExists(boolean0);
      createVolumeGroupRequest0.getTenantId();
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.getVnfVersion();
      createVolumeGroupRequest1.getVnfVersion();
      createVolumeGroupRequest1.getVolumeGroupName();
      Boolean boolean1 = createVolumeGroupRequest0.getSuppressBackout();
      assertNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = Boolean.FALSE;
      Boolean.getBoolean("p?:e~");
      createVolumeGroupRequest0.setFailIfExists(boolean0);
      createVolumeGroupRequest0.toXmlString();
      createVolumeGroupRequest0.setVnfVersion("\r>M+*VxIe4t0");
      createVolumeGroupRequest0.getFailIfExists();
      createVolumeGroupRequest0.toXmlString();
      createVolumeGroupRequest0.setVolumeGroupId("");
      createVolumeGroupRequest0.getVfModuleType();
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setVnfVersion("");
      createVolumeGroupRequest0.getVolumeGroupName();
      createVolumeGroupRequest0.setMsoRequest((MsoRequest) null);
      createVolumeGroupRequest0.setTenantId((String) null);
      createVolumeGroupRequest0.getTenantId();
      createVolumeGroupRequest0.setMsoRequest((MsoRequest) null);
      assertNull(createVolumeGroupRequest0.getVolumeGroupName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = Boolean.valueOf(true);
      createVolumeGroupRequest0.setFailIfExists(boolean0);
      createVolumeGroupRequest0.setVnfVersion("");
      createVolumeGroupRequest0.getFailIfExists();
      createVolumeGroupRequest0.getVnfVersion();
      Boolean boolean1 = createVolumeGroupRequest0.getFailIfExists();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setVfModuleType("@ 8T");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createVolumeGroupRequest0.setVolumeGroupParams(hashMap0);
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setVolumeGroupId("@ 8T");
      createVolumeGroupRequest0.setVolumeGroupId("@ 8T");
      createVolumeGroupRequest0.setVolumeGroupName("@ 8T");
      createVolumeGroupRequest0.getVolumeGroupName();
      createVolumeGroupRequest0.getVnfType();
      String string0 = createVolumeGroupRequest0.getVolumeGroupName();
      String string1 = createVolumeGroupRequest0.getVfModuleType();
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setVnfType("");
      createVolumeGroupRequest0.setVolumeGroupId("I<\"*}");
      createVolumeGroupRequest0.setTenantId("");
      createVolumeGroupRequest0.setMessageId("gZK#x[BqFD");
      createVolumeGroupRequest0.getVnfType();
      createVolumeGroupRequest0.getTenantId();
      Boolean boolean0 = new Boolean(true);
      Boolean.logicalOr(true, true);
      createVolumeGroupRequest0.setSuppressBackout(boolean0);
      createVolumeGroupRequest0.setFailIfExists(boolean0);
      assertTrue(createVolumeGroupRequest0.isSynchronous());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getSkipAAI();
      createVolumeGroupRequest0.setFailIfExists((Boolean) null);
      createVolumeGroupRequest0.setVfModuleType("");
      createVolumeGroupRequest0.setNotificationUrl("");
      createVolumeGroupRequest0.setVnfType((String) null);
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getSuppressBackout();
      MsoRequest msoRequest0 = new MsoRequest();
      createVolumeGroupRequest0.setMsoRequest(msoRequest0);
      String string0 = createVolumeGroupRequest0.getVfModuleType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      MsoRequest msoRequest0 = createVolumeGroupRequest0.getMsoRequest();
      createVolumeGroupRequest0.setMsoRequest(msoRequest0);
      assertNull(createVolumeGroupRequest0.getVnfType());
      
      createVolumeGroupRequest0.getVnfVersion();
      createVolumeGroupRequest0.getTenantId();
      Boolean boolean0 = Boolean.TRUE;
      createVolumeGroupRequest0.setSkipAAI(boolean0);
      createVolumeGroupRequest0.setSuppressBackout(boolean0);
      Boolean boolean1 = createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setVnfVersion("");
      Boolean.compare(false, false);
      createVolumeGroupRequest0.setSuppressBackout(boolean1);
      assertNull(createVolumeGroupRequest0.getVolumeGroupName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      createVolumeGroupRequest0.setVolumeGroupParams(hashMap0);
      createVolumeGroupRequest0.getVolumeGroupParams();
      createVolumeGroupRequest0.setVfModuleType("jaxb.formatted.output");
      assertNull(createVolumeGroupRequest0.getVnfType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest1.getSkipAAI();
      createVolumeGroupRequest0.setFailIfExists((Boolean) null);
      createVolumeGroupRequest0.setVnfType("Hi&CG{k}/*QY9RvXr");
      createVolumeGroupRequest1.setMessageId("");
      createVolumeGroupRequest1.setVnfType("xUUBE/B}M{1");
      String string0 = createVolumeGroupRequest1.getVnfType();
      assertEquals("xUUBE/B}M{1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setCloudSiteId("");
      createVolumeGroupRequest0.setVolumeGroupId("");
      createVolumeGroupRequest0.setMessageId("");
      createVolumeGroupRequest0.setVfModuleType("");
      String string0 = createVolumeGroupRequest0.getCloudSiteId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      Map<String, String> map0 = createVolumeGroupRequest1.getVolumeGroupParams();
      createVolumeGroupRequest1.setVolumeGroupParams(map0);
      createVolumeGroupRequest0.setTenantId("$m=");
      createVolumeGroupRequest0.setVolumeGroupParams(map0);
      createVolumeGroupRequest1.getSuppressBackout();
      createVolumeGroupRequest0.getTenantId();
      createVolumeGroupRequest1.setVolumeGroupId((String) null);
      createVolumeGroupRequest0.getVfModuleType();
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setFailIfExists((Boolean) null);
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setSuppressBackout((Boolean) null);
      createVolumeGroupRequest0.getVnfType();
      String string0 = createVolumeGroupRequest1.getVfModuleType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      MsoRequest msoRequest0 = new MsoRequest("V", "");
      createVolumeGroupRequest0.setMsoRequest(msoRequest0);
      createVolumeGroupRequest0.setVolumeGroupId("V");
      createVolumeGroupRequest0.getVolumeGroupId();
      Map<String, String> map0 = createVolumeGroupRequest0.getVolumeGroupParams();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setCloudSiteId("q^BO");
      createVolumeGroupRequest0.setCloudSiteId(")|yH");
      Boolean boolean0 = new Boolean(true);
      Boolean.logicalXor(true, true);
      createVolumeGroupRequest0.setSuppressBackout(boolean0);
      createVolumeGroupRequest0.setVnfVersion("1SaWHwHs.6GKc|");
      createVolumeGroupRequest0.getCloudSiteId();
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getCloudSiteId();
      CreateVolumeGroupRequest createVolumeGroupRequest2 = new CreateVolumeGroupRequest();
      assertNull(createVolumeGroupRequest2.getVfModuleType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = Boolean.valueOf(true);
      createVolumeGroupRequest0.setVolumeGroupId("");
      createVolumeGroupRequest0.setFailIfExists(boolean0);
      createVolumeGroupRequest0.setSuppressBackout(boolean0);
      createVolumeGroupRequest0.getVolumeGroupName();
      CreateVolumeGroupRequest createVolumeGroupRequest1 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getVolumeGroupId();
      createVolumeGroupRequest0.setVolumeGroupId((String) null);
      createVolumeGroupRequest1.setTenantId("k|l4f6h+M:_");
      assertNull(createVolumeGroupRequest1.getVnfVersion());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.toXmlString();
      createVolumeGroupRequest0.setMsoRequest((MsoRequest) null);
      createVolumeGroupRequest0.setVfModuleType("");
      createVolumeGroupRequest0.getFailIfExists();
      createVolumeGroupRequest0.setSuppressBackout((Boolean) null);
      createVolumeGroupRequest0.setSuppressBackout((Boolean) null);
      createVolumeGroupRequest0.getMsoRequest();
      createVolumeGroupRequest0.setMsoRequest((MsoRequest) null);
      createVolumeGroupRequest0.setVnfVersion("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<createVolumeGroupRequest>\n    <msoRequest/>\n    <volumeGroupParams/>\n</createVolumeGroupRequest>\n");
      createVolumeGroupRequest0.getVolumeGroupId();
      String string0 = createVolumeGroupRequest0.getVolumeGroupName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setVolumeGroupId("C}BU:zm--=1Md");
      Boolean boolean0 = Boolean.valueOf(false);
      createVolumeGroupRequest0.setSuppressBackout(boolean0);
      createVolumeGroupRequest0.setVnfVersion("");
      createVolumeGroupRequest0.setVfModuleType("i%IbRNJ6X^k'i&e+s");
      createVolumeGroupRequest0.setVnfType("");
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setVolumeGroupId("i%IbRNJ6X^k'i&e+s");
      createVolumeGroupRequest0.setTenantId("");
      createVolumeGroupRequest0.setVolumeGroupId("");
      createVolumeGroupRequest0.setVnfVersion("VK&a");
      createVolumeGroupRequest0.setTenantId("");
      assertEquals("", createVolumeGroupRequest0.getVolumeGroupId());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      String string0 = createVolumeGroupRequest0.getVnfVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      String string0 = createVolumeGroupRequest0.getTenantId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setVolumeGroupId("");
      assertNull(createVolumeGroupRequest0.getVolumeGroupName());
      
      String string0 = createVolumeGroupRequest0.getCloudSiteId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getVolumeGroupParams();
      createVolumeGroupRequest0.getVnfType();
      createVolumeGroupRequest0.setCloudSiteId("");
      assertEquals("", createVolumeGroupRequest0.getCloudSiteId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getFailIfExists();
      createVolumeGroupRequest0.setSuppressBackout((Boolean) null);
      assertNull(createVolumeGroupRequest0.getVnfType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setNotificationUrl("");
      createVolumeGroupRequest0.setVolumeGroupParams((Map<String, String>) null);
      createVolumeGroupRequest0.getFailIfExists();
      Boolean.compare(true, true);
      createVolumeGroupRequest0.setFailIfExists((Boolean) null);
      createVolumeGroupRequest0.getFailIfExists();
      createVolumeGroupRequest0.setVolumeGroupName("");
      createVolumeGroupRequest0.getVolumeGroupName();
      createVolumeGroupRequest0.getVolumeGroupParams();
      System.setCurrentTimeMillis(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.getSuppressBackout();
      createVolumeGroupRequest0.setFailIfExists((Boolean) null);
      assertNull(createVolumeGroupRequest0.getVfModuleType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.setVolumeGroupName("");
      assertNull(createVolumeGroupRequest0.getNotificationUrl());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      createVolumeGroupRequest0.toXmlString();
      String string0 = createVolumeGroupRequest0.getVolumeGroupId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Map<String, String> map0 = createVolumeGroupRequest0.getVolumeGroupParams();
      assertTrue(map0.isEmpty());
      
      createVolumeGroupRequest0.setVolumeGroupParams(map0);
      assertNull(createVolumeGroupRequest0.getVolumeGroupName());
  }
}
