/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:10:39 GMT 2016
 */

package org.openecomp.mso.db.catalog.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MavenLikeVersioningESTest extends MavenLikeVersioningESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.setVersion("8");
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "nS!?LIvx.hXgs?:=";
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("xqR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "8";
      String string0 = mavenLikeVersioning0.getVersion();
      assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "";
      String string0 = mavenLikeVersioning0.getVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "/g";
      // Undeclared exception!
      try { 
        mavenLikeVersioning0.isTheSameVersion("/g");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/g\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.setVersion("8");
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("90");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "";
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("dbqf\u0005I/ufZo.8No");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "8";
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "nS!?LIvx.hXgs?:=";
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      Boolean boolean0 = mavenLikeVersioning0.isTheSameVersion("8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "8";
      mavenLikeVersioning0.version = "90";
      Boolean boolean0 = mavenLikeVersioning0.isMoreRecentThan("8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "8";
      Boolean boolean0 = mavenLikeVersioning0.isMoreRecentThan("90");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.version = "8";
      Boolean boolean0 = mavenLikeVersioning0.isMoreRecentThan("8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.setVersion("3n+.F");
      // Undeclared exception!
      try { 
        mavenLikeVersioning0.isMoreRecentThan("Q");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"3n+\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      Boolean boolean0 = mavenLikeVersioning0.isMoreRecentThan("Q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      Boolean boolean0 = mavenLikeVersioning0.isMoreRecentThan((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      mavenLikeVersioning0.setVersion(".");
      // Undeclared exception!
      try { 
        mavenLikeVersioning0.isMoreRecentThan("Q");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.openecomp.mso.db.catalog.utils.MavenLikeVersioning", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MavenLikeVersioning mavenLikeVersioning0 = new MavenLikeVersioning();
      String string0 = mavenLikeVersioning0.getVersion();
      assertNull(string0);
  }
}
