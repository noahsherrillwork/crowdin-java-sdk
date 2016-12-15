package com.crowdin.exceptions;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class EmptyParameterException extends Exception{

  public EmptyParameterException(String message) {
    super(message);
  }

  public EmptyParameterException(String message, Throwable cause) {
    super(message, cause);
  }
  
}
