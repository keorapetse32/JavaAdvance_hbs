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
public class NumericFns<T extends Number> {
    T num; 
    
  // Pass the constructor a reference to   
  // a numeric object. 
  NumericFns(T n) {  
    num = n; 
  }  
  
  // Return the reciprocal. 
  double reciprocal() { 
    return 1 / num.doubleValue(); 
  } 
 
  // Return the fractional component. 
  double fraction() { 
    return num.doubleValue() - num.intValue(); 
  } 
 
  // Determine if the absolute values of two 
  // objects are the same. 
  boolean absEqual(NumericFns<?> ob) { 
    if(Math.abs(num.doubleValue()) == 
         Math.abs(ob.num.doubleValue())) return true; 
 
    return false; 
  } 
 
  // ...
}
