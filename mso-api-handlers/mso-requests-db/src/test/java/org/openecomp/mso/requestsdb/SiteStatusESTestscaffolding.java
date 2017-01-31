/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 14 15:16:15 GMT 2016
 */

package org.openecomp.mso.requestsdb;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SiteStatusESTestscaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.openecomp.mso.requestsdb.SiteStatus"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SiteStatusESTestscaffolding.class.getClassLoader() ,
      "org.openecomp.mso.logger.MessageEnum",
      "com.att.eelf.i18n.EELFResolvableErrorEnum",
      "org.openecomp.mso.logger.MsoLogger$Catalog",
      "org.openecomp.mso.logger.MsoLogger$StatusCode",
      "com.att.eelf.i18n.EELFResourceManager$RESOURCE_TYPES",
      "com.att.eelf.configuration.EELFManager",
      "com.att.eelf.configuration.EELFLogger",
      "com.att.eelf.i18n.EELFMsgs",
      "org.openecomp.mso.entity.MsoRequest",
      "com.att.eelf.configuration.EELFLogger$Level",
      "org.openecomp.mso.logger.MsoLogger$ResponseCode",
      "com.att.eelf.configuration.SLF4jWrapper",
      "com.att.eelf.i18n.EELFResourceManager",
      "org.openecomp.mso.requestsdb.SiteStatus",
      "org.openecomp.mso.logger.MsoLogger",
      "org.openecomp.mso.logger.MsoLogger$ErrorCode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SiteStatusESTestscaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.openecomp.mso.logger.MsoLogger$Catalog",
      "org.openecomp.mso.logger.MsoLogger",
      "com.att.eelf.i18n.EELFResourceManager",
      "com.att.eelf.i18n.EELFMsgs",
      "com.att.eelf.i18n.EELFResourceManager$RESOURCE_TYPES",
      "com.att.eelf.configuration.EELFLogger$Level",
      "com.att.eelf.configuration.EELFManager",
      "org.openecomp.mso.logger.MessageEnum",
      "org.openecomp.mso.requestsdb.SiteStatus"
    );
  }
}
