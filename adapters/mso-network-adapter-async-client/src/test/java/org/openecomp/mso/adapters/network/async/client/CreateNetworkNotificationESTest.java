/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:38:53 GMT 2016
 */

package org.openecomp.mso.adapters.network.async.client;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CreateNetworkNotificationESTest extends CreateNetworkNotificationESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      CreateNetworkNotification.SubnetIdMap createNetworkNotification_SubnetIdMap0 = new CreateNetworkNotification.SubnetIdMap();
      createNetworkNotification0.setSubnetIdMap(createNetworkNotification_SubnetIdMap0);
      CreateNetworkNotification.SubnetIdMap createNetworkNotification_SubnetIdMap1 = createNetworkNotification0.getSubnetIdMap();
      assertSame(createNetworkNotification_SubnetIdMap1, createNetworkNotification_SubnetIdMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.neutronNetworkId = "org.openecomp.mso.adapters.network.async.client.MsoExceptionCategory";
      String string0 = createNetworkNotification0.getNeutronNetworkId();
      assertEquals("org.openecomp.mso.adapters.network.async.client.MsoExceptionCategory", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.neutronNetworkId = "";
      String string0 = createNetworkNotification0.getNeutronNetworkId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setNetworkId("IO");
      String string0 = createNetworkNotification0.getNetworkId();
      assertEquals("IO", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setMessageId(",x!0'6/o1Bj\"nxg JH");
      String string0 = createNetworkNotification0.getMessageId();
      assertEquals(",x!0'6/o1Bj\"nxg JH", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.messageId = "";
      String string0 = createNetworkNotification0.getMessageId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.errorMessage = "";
      String string0 = createNetworkNotification0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      String string0 = createNetworkNotification0.getNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      NetworkRollback networkRollback0 = createNetworkNotification0.getRollback();
      assertNull(networkRollback0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      boolean boolean0 = createNetworkNotification0.isCompleted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.getException();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setErrorMessage("org.openecomp.mso.adapters.network.async.client.MsoExceptionCategory");
      String string0 = createNetworkNotification0.getErrorMessage();
      assertEquals("org.openecomp.mso.adapters.network.async.client.MsoExceptionCategory", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      String string0 = createNetworkNotification0.getNeutronNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setNeutronNetworkId("");
      assertNull(createNetworkNotification0.getErrorMessage());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.OPENSTACK;
      createNetworkNotification0.setException(msoExceptionCategory0);
      MsoExceptionCategory msoExceptionCategory1 = createNetworkNotification0.getException();
      assertEquals(MsoExceptionCategory.OPENSTACK, msoExceptionCategory1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setRollback((NetworkRollback) null);
      assertNull(createNetworkNotification0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setCompleted(true);
      boolean boolean0 = createNetworkNotification0.isCompleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      createNetworkNotification0.setNetworkId("");
      String string0 = createNetworkNotification0.getNetworkId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      CreateNetworkNotification.SubnetIdMap createNetworkNotification_SubnetIdMap0 = createNetworkNotification0.getSubnetIdMap();
      assertNull(createNetworkNotification_SubnetIdMap0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      String string0 = createNetworkNotification0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CreateNetworkNotification createNetworkNotification0 = new CreateNetworkNotification();
      String string0 = createNetworkNotification0.getMessageId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CreateNetworkNotification.SubnetIdMap.Entry createNetworkNotification_SubnetIdMap_Entry0 = new CreateNetworkNotification.SubnetIdMap.Entry();
      createNetworkNotification_SubnetIdMap_Entry0.setKey("");
      assertEquals("", createNetworkNotification_SubnetIdMap_Entry0.getKey());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CreateNetworkNotification.SubnetIdMap.Entry createNetworkNotification_SubnetIdMap_Entry0 = new CreateNetworkNotification.SubnetIdMap.Entry();
      String string0 = createNetworkNotification_SubnetIdMap_Entry0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CreateNetworkNotification.SubnetIdMap.Entry createNetworkNotification_SubnetIdMap_Entry0 = new CreateNetworkNotification.SubnetIdMap.Entry();
      createNetworkNotification_SubnetIdMap_Entry0.setValue("'G^M#'lcLg6Gw}");
      assertNull(createNetworkNotification_SubnetIdMap_Entry0.getKey());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CreateNetworkNotification.SubnetIdMap.Entry createNetworkNotification_SubnetIdMap_Entry0 = new CreateNetworkNotification.SubnetIdMap.Entry();
      String string0 = createNetworkNotification_SubnetIdMap_Entry0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CreateNetworkNotification.SubnetIdMap createNetworkNotification_SubnetIdMap0 = new CreateNetworkNotification.SubnetIdMap();
      createNetworkNotification_SubnetIdMap0.getEntry();
      List<CreateNetworkNotification.SubnetIdMap.Entry> list0 = createNetworkNotification_SubnetIdMap0.getEntry();
      assertTrue(list0.isEmpty());
  }
}
