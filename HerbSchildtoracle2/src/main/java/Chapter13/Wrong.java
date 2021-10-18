/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author keora
 */
public class Wrong<T> {
    // Wrong, no static variables of type T. 
  static T ob; 
    
  // Wrong, no static method can use T. 
  static T getob() { 
    return ob; 
  } 
 
  // Wrong, no static method can access object 
  // of type T. 
  static void showob() { 
    System.out.println(ob); 
 }
}
