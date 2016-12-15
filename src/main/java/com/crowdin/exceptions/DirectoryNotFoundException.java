package com.crowdin.exceptions;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class DirectoryNotFoundException extends Exception{

  public DirectoryNotFoundException(String message) {
    super(message);
  }

  public DirectoryNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
  
}
