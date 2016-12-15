/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowdin.exceptions;

/**
 *
 * @author ihor <ihor.popyk@crowdin.com>
 */
public class UnAcceptableParametersValueException extends Exception {

  public UnAcceptableParametersValueException(String message) {
    super(message);
  }

  public UnAcceptableParametersValueException(String message, Throwable cause) {
    super(message, cause);
  }
  
}
