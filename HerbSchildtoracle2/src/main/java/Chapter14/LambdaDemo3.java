/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

interface StringTest { 
  boolean test(String aStr, String bStr); 
}
/**
 *
 * @author keora
 */
public class LambdaDemo3 {
    public static void main(String args[]) 
  { 
    // This lambda expression determines if one string is  
    // part of another. 
    StringTest isIn = (a, b) -> a.indexOf(b) != -1; 
 
    String str = "This is a test"; 
 
    System.out.println("Testing string: " + str); 
 
    if(isIn.test(str, "is a")) 
      System.out.println("'is a' found."); 
    else 
      System.out.println("'is a' not found."); 
 
    if(isIn.test(str, "xyz")) 
      System.out.println("'xyz' Found"); 
    else 
     System.out.println("'xyz' not found"); 
  }
}
