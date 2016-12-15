package com.crowdin.utils;

import com.crowdin.exceptions.EmptyParameterException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class UrlBuilderTest {
  
  public static final String  BASE_URL = "https://api.crowdin.com/api/";
  
  public static final String  PROJECT_IDENTIFIER = "test_pi";
  
  public static final String  PROJECT_KEY = "test_pk";
  
  public static final String  ACCOUNT_KEY = "test_ac";
  
  public static final String  DOWNLAOD_PACKAGE = "test";
  
  public static final String  PATH = "project/%(project-identifier)/language-status?key=%(project-key)";
  
  public static final String  PATH_WITH_ACCOUNT = "account/get-projects?account-key=%(account-key)";
  
  public static final String  PATH_WITH_DOWNLOAD_PACKAGE = "project/%(project-identifier)/download/%(download-package).zip?key=%(project-key)";
  
  public static final String  RESULT_URL = "https://api.crowdin.com/api/project/test_pi/language-status?key=test_pk";
  
  public static final String  RESULT_URL_WITH_ACCOUNT = "https://api.crowdin.com/api/account/get-projects?account-key=test_ac";
  
  public static final String  RESULT_URL_WITH_DOWNLOAD_PACKAGE = "https://api.crowdin.com/api/project/test_pi/download/test.zip?key=test_pk";
  
  @Test
  public void testBuild() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    Assert.assertEquals(RESULT_URL, builder.build(BASE_URL, PATH, PROJECT_IDENTIFIER, PROJECT_KEY, null, null, null));
    Assert.assertEquals(RESULT_URL_WITH_ACCOUNT, builder.build(BASE_URL, PATH_WITH_ACCOUNT, null, null, null, ACCOUNT_KEY, null));
    Assert.assertEquals(RESULT_URL_WITH_DOWNLOAD_PACKAGE, builder.build(BASE_URL, PATH_WITH_DOWNLOAD_PACKAGE, PROJECT_IDENTIFIER, PROJECT_KEY, DOWNLAOD_PACKAGE, null, null));
  }
  
  @Test(expected = EmptyParameterException.class)
  public void testBuildProjectIdentifyNull() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    builder.build(BASE_URL, PATH, null, PROJECT_KEY, null, null, null);
  }
  
  @Test(expected = EmptyParameterException.class)
  public void testBuildProjectKeyNull() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    builder.build(BASE_URL, PATH, PROJECT_IDENTIFIER, null, null, null, null);
  }
  
  @Test(expected = EmptyParameterException.class)
  public void testBuildProjectIdentifyAndKeyNull() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    builder.build(BASE_URL, PATH, null, null, null, null, null);
  }
  
  @Test(expected = EmptyParameterException.class)
  public void testBuildAccountKeyNull() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    builder.build(BASE_URL, PATH_WITH_ACCOUNT, null, null, null, null, null);
  }
  
  @Test(expected = EmptyParameterException.class)
  public void testBuildDownloadPackageNull() throws EmptyParameterException {
    UrlBuilder builder = new UrlBuilder();
    builder.build(BASE_URL, PATH_WITH_DOWNLOAD_PACKAGE, PROJECT_IDENTIFIER, PROJECT_KEY, null, null, null);
  }
  
}
