/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 11:33:04 GMT 2016
 */

package org.openecomp.mso.bpmn.core.mybatis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class URNMappingESTest extends URNMappingESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = URNMapping.createIdentifierFromURN("!`OYz|WztoeK|A&=&M");
      assertEquals("URN_OYz_WztoeK_A_M", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setValue("=F'A%");
      String string0 = uRNMapping0.getValue();
      assertEquals("=F'A%", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setValue("");
      String string0 = uRNMapping0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setRev("");
      String string0 = uRNMapping0.getRev();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setName("");
      String string0 = uRNMapping0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        URNMapping.createIdentifierFromURN((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.bpmn.core.mybatis.URNMapping", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = URNMapping.createIdentifierFromURN("mfJ\"%euO;@S_Xm");
      assertEquals("URN_mfJ_euO_S_Xm", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setRev(":pMWjfl,zq_IA");
      String string0 = uRNMapping0.getRev();
      assertEquals(":pMWjfl,zq_IA", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      String string0 = uRNMapping0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      String string0 = uRNMapping0.getRev();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      String string0 = uRNMapping0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URNMapping uRNMapping0 = new URNMapping();
      uRNMapping0.setName("c<");
      String string0 = uRNMapping0.getName();
      assertEquals("c<", string0);
  }
}
