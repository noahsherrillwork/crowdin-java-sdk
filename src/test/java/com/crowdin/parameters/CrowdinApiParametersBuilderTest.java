package com.crowdin.parameters;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class CrowdinApiParametersBuilderTest {
  
  @Test
  public void testAutoApproveImported() {
    CrowdinApiParametersBuilder builder = new CrowdinApiParametersBuilder();
    builder.autoApproveImported(Boolean.FALSE);
    Assert.assertEquals(Boolean.FALSE, builder.getAutoApproveImported());
  }
  
}