package com.crowdin;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class Credentials {
  
  protected String baseUrl;
  
  protected String projectIdentifier;
  
  protected String projectKey;
  
  protected String accountKey;

  public Credentials() {
  }

  public Credentials(String baseUrl, String projectIdentifier, String projectKey, String accountKey) {
    this.baseUrl = baseUrl;
    this.projectIdentifier = projectIdentifier;
    this.projectKey = projectKey;
    this.accountKey = accountKey;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public String getProjectKey() {
    return projectKey;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }
  
}