/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:04:06 GMT 2016
 */

package org.openecomp.mso.logger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.PrivateAccess;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MsoLoggingServletESTest extends MsoLoggingServletESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MsoLoggingServlet msoLoggingServlet0 = new MsoLoggingServlet();
      try { 
        PrivateAccess.callMethod((Class<MsoLoggingServlet>) MsoLoggingServlet.class, msoLoggingServlet0, "isMsoLogger", (Object) null, (Class<?>) String.class);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.logger.MsoLoggingServlet", e);
      }
  }
}
