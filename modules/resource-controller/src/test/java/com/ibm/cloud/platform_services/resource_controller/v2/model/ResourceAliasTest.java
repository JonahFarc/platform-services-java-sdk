/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.resource_controller.v2.model;

import com.ibm.cloud.platform_services.resource_controller.v2.model.ResourceAlias;
import com.ibm.cloud.platform_services.resource_controller.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceAlias model.
 */
public class ResourceAliasTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceAlias() throws Throwable {
    ResourceAlias resourceAliasModel = new ResourceAlias();
    assertNull(resourceAliasModel.getId());
    assertNull(resourceAliasModel.getGuid());
    assertNull(resourceAliasModel.getUrl());
    assertNull(resourceAliasModel.getCreatedAt());
    assertNull(resourceAliasModel.getUpdatedAt());
    assertNull(resourceAliasModel.getDeletedAt());
    assertNull(resourceAliasModel.getCreatedBy());
    assertNull(resourceAliasModel.getUpdatedBy());
    assertNull(resourceAliasModel.getDeletedBy());
    assertNull(resourceAliasModel.getName());
    assertNull(resourceAliasModel.getResourceInstanceId());
    assertNull(resourceAliasModel.getTargetCrn());
    assertNull(resourceAliasModel.getAccountId());
    assertNull(resourceAliasModel.getResourceId());
    assertNull(resourceAliasModel.getResourceGroupId());
    assertNull(resourceAliasModel.getCrn());
    assertNull(resourceAliasModel.getRegionInstanceId());
    assertNull(resourceAliasModel.getRegionInstanceCrn());
    assertNull(resourceAliasModel.getState());
    assertNull(resourceAliasModel.isMigrated());
    assertNull(resourceAliasModel.getResourceInstanceUrl());
    assertNull(resourceAliasModel.getResourceBindingsUrl());
    assertNull(resourceAliasModel.getResourceKeysUrl());
  }
}