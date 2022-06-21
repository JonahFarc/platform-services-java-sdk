/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.platform_services.context_based_restrictions.v1.model;

import com.ibm.cloud.platform_services.context_based_restrictions.v1.model.RuleContext;
import com.ibm.cloud.platform_services.context_based_restrictions.v1.model.RuleContextAttribute;
import com.ibm.cloud.platform_services.context_based_restrictions.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RuleContext model.
 */
public class RuleContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRuleContext() throws Throwable {
    RuleContextAttribute ruleContextAttributeModel = new RuleContextAttribute.Builder()
      .name("testString")
      .value("testString")
      .build();
    assertEquals(ruleContextAttributeModel.name(), "testString");
    assertEquals(ruleContextAttributeModel.value(), "testString");

    RuleContext ruleContextModel = new RuleContext.Builder()
      .attributes(new java.util.ArrayList<RuleContextAttribute>(java.util.Arrays.asList(ruleContextAttributeModel)))
      .build();
    assertEquals(ruleContextModel.attributes(), new java.util.ArrayList<RuleContextAttribute>(java.util.Arrays.asList(ruleContextAttributeModel)));

    String json = TestUtilities.serialize(ruleContextModel);

    RuleContext ruleContextModelNew = TestUtilities.deserialize(json, RuleContext.class);
    assertTrue(ruleContextModelNew instanceof RuleContext);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRuleContextError() throws Throwable {
    new RuleContext.Builder().build();
  }

}