/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 11:30:51 GMT 2016
 */

package org.openecomp.mso.bpmn.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.impl.pvm.runtime.ExecutionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.PrivateAccess;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ReadFileTaskESTest extends ReadFileTaskESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadFileTask readFileTask0 = new ReadFileTask();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      Expression expression0 = mock(Expression.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(expression0).getValue(any(org.camunda.bpm.engine.delegate.VariableScope.class));
      PrivateAccess.setVariable((Class<ReadFileTask>) ReadFileTask.class, readFileTask0, "inputVariable", (Object) expression0);
      try { 
        readFileTask0.execute(executionImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ReadFileTask injected field 'inputVariable' is bad: required field has null value
         //
         verifyException("org.openecomp.mso.bpmn.core.BaseTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadFileTask readFileTask0 = new ReadFileTask();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      try { 
        readFileTask0.execute(executionImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ReadFileTask injected field 'inputVariable' is bad: missing required field
         //
         verifyException("org.openecomp.mso.bpmn.core.BaseTask", e);
      }
  }
}
