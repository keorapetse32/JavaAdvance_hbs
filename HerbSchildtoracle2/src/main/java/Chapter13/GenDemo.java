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
public class GenDemo {
    public static void main(String args[]) { 
    // Create a Gen reference for Integers.  
    Gen<Integer> iOb;  
 
    // Create a Gen<Integer> object and assign its 
    // reference to iOb.  Notice the use of autoboxing  
    // to encapsulate the value 88 within an Integer object. 
    iOb = new Gen<Integer>(88); 
 
    // Show the type of data used by iOb. 
    iOb.showType(); 
 
    // Get the value in iOb. Notice that 
    // no cast is needed. 
    int v = iOb.getob(); 
    System.out.println("value: " + v); 
 
    System.out.println(); 
 
    // Create a Gen object for Strings. 
    Gen<String> strOb = new Gen<String>("Generics Test"); 
 
    // Show the type of data used by strOb. 
    strOb.showType(); 
 
    // Get the value of strOb. Again, notice 
    // that no cast is needed. 
    String str = strOb.getob(); 
    System.out.println("value: " + str); 
  }
}
