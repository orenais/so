/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 25 13:29:36 GMT 2016
 */

package org.openecomp.mso.asdc.installer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.openecomp.mso.db.catalog.beans.Service;
import org.openecomp.mso.db.catalog.beans.VnfResource;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.PrivateAccess;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import org.openecomp.sdc.api.IDistributionClient;
import org.openecomp.sdc.api.notification.IArtifactInfo;
import org.openecomp.sdc.api.notification.INotificationData;
import org.openecomp.sdc.api.notification.IResourceInstance;
import org.openecomp.sdc.impl.DistributionClientDownloadResultImpl;
import org.openecomp.sdc.impl.mock.DistributionClientDownloadResultStubImpl;
import org.openecomp.sdc.impl.mock.DistributionClientStubImpl;
import org.openecomp.sdc.utils.DistributionActionResultEnum;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class VfResourceStructureESTest extends VfResourceStructureESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesStructureList", (Object) null);
      vfResourceStructure0.getVfModuleStructure();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) vfResourceStructure0);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesStructureList", (Object) linkedList0);
      vfResourceStructure0.getVfModuleStructure();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure((INotificationData) null, (IResourceInstance) null);
      vfResourceStructure0.getResourceInstance();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      doReturn("").when(iNotificationData0).toString();
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getNotification();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      Service service0 = new Service();
      service0.setId(6);
      vfResourceStructure0.setCatalogService(service0);
      vfResourceStructure0.getCatalogService();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      Iterator<ChronoLocalDate> iterator0 = (Iterator<ChronoLocalDate>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      List<ChronoLocalDate> list0 = (List<ChronoLocalDate>) mock(List.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(list0).iterator();
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesMetadataList", (Object) list0);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "isDeployedSuccessfully", (Object) true);
      List<MockHijrahDate> list1 = (List<MockHijrahDate>) mock(List.class, new ViolatedAssumptionAnswer());
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "isDeployedSuccessfully", (Object) true);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesStructureList", (Object) list1);
      // Undeclared exception!
      try { 
        vfResourceStructure0.createVfModuleStructures();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.openecomp.mso.asdc.installer.VfResourceStructure", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      Iterator<ChronoLocalDate> iterator0 = (Iterator<ChronoLocalDate>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      List<ChronoLocalDate> list0 = (List<ChronoLocalDate>) mock(List.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(list0).iterator();
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesMetadataList", (Object) list0);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "isDeployedSuccessfully", (Object) true);
      List<MockHijrahDate> list1 = (List<MockHijrahDate>) mock(List.class, new ViolatedAssumptionAnswer());
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "isDeployedSuccessfully", (Object) true);
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesStructureList", (Object) list1);
      vfResourceStructure0.createVfModuleStructures();
      IDistributionClient iDistributionClient0 = mock(IDistributionClient.class, new ViolatedAssumptionAnswer());
      IArtifactInfo iArtifactInfo0 = null;
      DistributionActionResultEnum distributionActionResultEnum0 = DistributionActionResultEnum.ARTIFACT_NOT_FOUND;
      DistributionClientDownloadResultImpl distributionClientDownloadResultImpl0 = new DistributionClientDownloadResultImpl(distributionActionResultEnum0, "");
      List<Object> list2 = (List<Object>) mock(List.class, new ViolatedAssumptionAnswer());
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesMetadataList", (Object) list2);
      // Undeclared exception!
      try { 
        vfResourceStructure0.addArtifactToStructure(iDistributionClient0, (IArtifactInfo) null, distributionClientDownloadResultImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      ChronoLocalDate chronoLocalDate0 = mock(ChronoLocalDate.class, new ViolatedAssumptionAnswer());
      Iterator<ChronoLocalDate> iterator0 = (Iterator<ChronoLocalDate>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn(chronoLocalDate0).when(iterator0).next();
      List<ChronoLocalDate> list0 = (List<ChronoLocalDate>) mock(List.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(list0).iterator();
      PrivateAccess.setVariable((Class<VfResourceStructure>) VfResourceStructure.class, vfResourceStructure0, "vfModulesMetadataList", (Object) list0);
      // Undeclared exception!
      try { 
        vfResourceStructure0.createVfModuleStructures();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // $java.time.chrono.ChronoLocalDate$$EnhancerByMockitoWithCGLIB$$27d47344 cannot be cast to org.openecomp.sdc.api.notification.IVfModuleMetadata
         //
         verifyException("org.openecomp.mso.asdc.installer.VfResourceStructure", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      try { 
        vfResourceStructure0.createVfModuleStructures();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // VfModule Meta DATA could not be decoded properly or was not present in the notification
         //
         verifyException("org.openecomp.mso.asdc.installer.VfResourceStructure", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("%[76").when(iArtifactInfo0).getArtifactType();
      DistributionClientDownloadResultStubImpl distributionClientDownloadResultStubImpl0 = (DistributionClientDownloadResultStubImpl)distributionClientStubImpl0.download(iArtifactInfo0);
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo0, distributionClientDownloadResultStubImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("HEAT_ARTIFACT").when(iArtifactInfo0).getArtifactType();
      doReturn((String) null).when(iArtifactInfo0).getArtifactUUID();
      DistributionClientDownloadResultStubImpl distributionClientDownloadResultStubImpl0 = (DistributionClientDownloadResultStubImpl)distributionClientStubImpl0.download(iArtifactInfo0);
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo0, distributionClientDownloadResultStubImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      DistributionClientDownloadResultStubImpl distributionClientDownloadResultStubImpl0 = (DistributionClientDownloadResultStubImpl)distributionClientStubImpl0.download(iArtifactInfo0);
      IArtifactInfo iArtifactInfo1 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("HEAT").when(iArtifactInfo1).getArtifactType();
      doReturn("%[76").when(iArtifactInfo1).getArtifactUUID();
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo1, distributionClientDownloadResultStubImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      DistributionClientDownloadResultStubImpl distributionClientDownloadResultStubImpl0 = (DistributionClientDownloadResultStubImpl)distributionClientStubImpl0.download(iArtifactInfo0);
      IArtifactInfo iArtifactInfo1 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("HEAT_NET").when(iArtifactInfo1).getArtifactType();
      doReturn("HEAT_ENV").when(iArtifactInfo1).getArtifactUUID();
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo1, distributionClientDownloadResultStubImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure((INotificationData) null, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("HEAT_ENV").when(iArtifactInfo0).getArtifactType();
      doReturn("*Z\"P4rvOA+mW").when(iArtifactInfo0).getArtifactUUID();
      DistributionActionResultEnum distributionActionResultEnum0 = DistributionActionResultEnum.UEB_KEYS_CREATION_FAILED;
      byte[] byteArray0 = new byte[6];
      DistributionClientDownloadResultImpl distributionClientDownloadResultImpl0 = new DistributionClientDownloadResultImpl(distributionActionResultEnum0, "]=)|;N.$hV]d^", "s:h+", byteArray0);
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo0, distributionClientDownloadResultImpl0);
      Map<String, VfModuleArtifact> map0 = vfResourceStructure0.getArtifactsMapByUUID();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("VF_MODULES_METADATA").when(iArtifactInfo0).getArtifactType();
      DistributionActionResultEnum distributionActionResultEnum0 = DistributionActionResultEnum.BAD_REQUEST;
      byte[] byteArray0 = new byte[2];
      DistributionClientDownloadResultImpl distributionClientDownloadResultImpl0 = new DistributionClientDownloadResultImpl(distributionActionResultEnum0, "<B['", "<B['", byteArray0);
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo0, distributionClientDownloadResultImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      DistributionClientStubImpl distributionClientStubImpl0 = new DistributionClientStubImpl();
      IArtifactInfo iArtifactInfo0 = mock(IArtifactInfo.class, new ViolatedAssumptionAnswer());
      doReturn("HEAT_NESTED").when(iArtifactInfo0).getArtifactType();
      doReturn("HEAT_NESTED").when(iArtifactInfo0).getArtifactUUID();
      DistributionActionResultEnum distributionActionResultEnum0 = DistributionActionResultEnum.BAD_REQUEST;
      byte[] byteArray0 = new byte[2];
      DistributionClientDownloadResultImpl distributionClientDownloadResultImpl0 = new DistributionClientDownloadResultImpl(distributionActionResultEnum0, "<B['", "<B['", byteArray0);
      vfResourceStructure0.addArtifactToStructure(distributionClientStubImpl0, iArtifactInfo0, distributionClientDownloadResultImpl0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getCatalogService();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getVfModulesStructureList();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getArtifactsMapByUUID();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
      
      vfResourceStructure0.setSuccessfulDeployment();
      boolean boolean0 = vfResourceStructure0.isDeployedSuccessfully();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getCatalogVnfResource();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getVfModuleStructure();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      boolean boolean0 = vfResourceStructure0.isDeployedSuccessfully();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure((INotificationData) null, iResourceInstance0);
      vfResourceStructure0.getNotification();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      VnfResource vnfResource0 = new VnfResource();
      vfResourceStructure0.setCatalogVnfResource(vnfResource0);
      vfResourceStructure0.getCatalogVnfResource();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      Service service0 = new Service();
      vfResourceStructure0.setCatalogService(service0);
      vfResourceStructure0.getCatalogService();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      INotificationData iNotificationData0 = mock(INotificationData.class, new ViolatedAssumptionAnswer());
      IResourceInstance iResourceInstance0 = mock(IResourceInstance.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(iResourceInstance0).toString();
      VfResourceStructure vfResourceStructure0 = new VfResourceStructure(iNotificationData0, iResourceInstance0);
      vfResourceStructure0.getResourceInstance();
      assertFalse(vfResourceStructure0.isDeployedSuccessfully());
  }
}
