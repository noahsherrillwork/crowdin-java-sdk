package com.crowdin;

import com.crowdin.client.CrowdinApiClient;
import com.crowdin.exceptions.EmptyParameterException;
import com.crowdin.parameters.CrowdinApiParametersBuilder;
import com.sun.xml.bind.marshaller.SAX2DOMEx;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class Crowdin {
  
  public static final String  DEFAULT_BASE_URL = "https://api.crowdin.com/api/";
  
  public static final String  DEFAULT_PROJECT_IDENTIFIER = "your-project-identifier";
  
  public static final String  DEFAULT_PROJECT_KEY = "your-project-key";
  
  public static final String  DEFAULT_ACCOUNT_KEY = "your-account-key";
  
  public static void main(String[] args) throws EmptyParameterException {
    Credentials credentials = new Credentials(DEFAULT_BASE_URL, DEFAULT_PROJECT_IDENTIFIER, DEFAULT_PROJECT_KEY, DEFAULT_ACCOUNT_KEY);
    CrowdinApiParametersBuilder parameters = new CrowdinApiParametersBuilder();
    CrowdinApiClient crwdn = new Crwdn();
    parameters.json();
    System.out.println(crwdn.getInfo(credentials, parameters).getEntity(String.class));
  }
}