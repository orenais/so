/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 25 13:37:00 GMT 2016
 */

package org.openecomp.mso.asdc.installer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class VfModuleStructureESTestscaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.openecomp.mso.asdc.installer.VfModuleStructure"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VfModuleStructureESTestscaffolding.class.getClassLoader() ,
      "org.openecomp.sdc.api.IDistributionClient",
      "org.openecomp.mso.db.catalog.utils.MavenLikeVersioning",
      "org.openecomp.mso.asdc.installer.VfResourceStructure",
      "org.openecomp.mso.asdc.client.exceptions.ArtifactInstallerException",
      "org.openecomp.mso.db.catalog.beans.VnfResource",
      "org.openecomp.sdc.api.notification.IVfModuleMetadata",
      "org.openecomp.mso.db.catalog.beans.VfModule",
      "org.openecomp.sdc.api.results.IDistributionClientResult",
      "org.openecomp.sdc.api.notification.IArtifactInfo",
      "org.openecomp.mso.db.catalog.beans.Service",
      "org.openecomp.mso.asdc.installer.VfModuleStructure",
      "org.openecomp.sdc.api.notification.INotificationData",
      "org.openecomp.mso.asdc.installer.VfModuleArtifact",
      "org.openecomp.sdc.api.notification.IResourceInstance",
      "org.openecomp.sdc.api.results.IDistributionClientDownloadResult"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VfModuleStructureESTestscaffolding.class.getClassLoader());

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.openecomp.mso.asdc.client.exceptions.ArtifactInstallerException"
    );
  }
}
