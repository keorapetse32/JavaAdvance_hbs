/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author keora
 */
@Deprecated
public class MyClass {
    private String msg; 
 
  MyClass(String m) { 
    msg = m; 
  } 
   
  // Deprecate a method within a class. 
  @Deprecated 
  String getMsg() { 
    return msg; 
  } 
 
  // ...
}
