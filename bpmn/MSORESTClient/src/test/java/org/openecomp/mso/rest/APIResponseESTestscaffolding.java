/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 14 11:46:25 GMT 2016
 */

package org.openecomp.mso.rest;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class APIResponseESTestscaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.openecomp.mso.rest.APIResponse"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(APIResponseESTestscaffolding.class.getClassLoader() ,
      "org.apache.http.HttpVersion",
      "org.apache.http.message.BasicNameValuePair",
      "org.apache.http.message.HeaderGroup",
      "org.apache.http.message.HeaderValueParser",
      "org.apache.http.message.BasicStatusLine",
      "org.apache.http.message.BasicHeaderValueParser",
      "org.apache.http.message.BasicLineFormatter",
      "org.apache.http.entity.ByteArrayEntity",
      "org.apache.http.Header",
      "org.apache.http.StatusLine",
      "org.apache.http.util.EntityUtils",
      "org.apache.http.message.BasicHttpResponse",
      "org.apache.http.FormattedHeader",
      "org.apache.http.RequestLine",
      "org.apache.http.HttpMessage",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.Consts",
      "org.apache.http.protocol.HTTP",
      "org.apache.http.util.ByteArrayBuffer",
      "org.apache.http.ParseException",
      "org.apache.http.HeaderIterator",
      "org.apache.http.entity.AbstractHttpEntity",
      "org.openecomp.mso.rest.RESTException",
      "org.apache.http.util.Args",
      "org.apache.http.ReasonPhraseCatalog",
      "org.apache.http.HttpEntity",
      "org.apache.http.entity.ContentType",
      "org.apache.http.message.LineFormatter",
      "org.apache.http.entity.StringEntity",
      "org.openecomp.mso.rest.HttpHeader",
      "org.apache.http.HeaderElement",
      "org.apache.http.message.BufferedHeader",
      "org.openecomp.mso.rest.APIResponse",
      "org.apache.http.util.CharArrayBuffer",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.util.TextUtils",
      "org.apache.http.impl.EnglishReasonPhraseCatalog",
      "org.apache.http.params.HttpParams",
      "org.apache.http.message.BasicHeader",
      "org.apache.http.HttpResponse",
      "org.apache.http.NameValuePair",
      "org.apache.http.message.ParserCursor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(APIResponseESTestscaffolding.class.getClassLoader());

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.http.message.HeaderGroup",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.message.BasicStatusLine",
      "org.apache.http.message.BasicLineFormatter",
      "org.apache.http.util.CharArrayBuffer",
      "org.apache.http.HttpVersion",
      "org.apache.http.impl.EnglishReasonPhraseCatalog",
      "org.apache.http.message.BasicHeader",
      "org.apache.http.message.BasicHeaderValueParser",
      "org.apache.http.Consts",
      "org.apache.http.protocol.HTTP",
      "org.apache.http.message.BasicNameValuePair",
      "org.apache.http.message.BufferedHeader",
      "org.apache.http.ParseException",
      "org.apache.http.entity.AbstractHttpEntity",
      "org.apache.http.util.ByteArrayBuffer",
      "org.apache.http.entity.ContentType"
    );
  }
}
