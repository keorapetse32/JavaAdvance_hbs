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
public class GenIFDemo {
    public static void main(String args[]) {  
    Integer x[] = { 1, 2, 3 }; 
 
    MyClass<Integer> ob = new MyClass<Integer>(x); 
 
    if(ob.contains(2)) 
      System.out.println("2 is in ob"); 
    else 
      System.out.println("2 is NOT in ob"); 
 
    if(ob.contains(5)) 
      System.out.println("5 is in ob"); 
    else 
      System.out.println("5 is NOT in ob"); 
 
    // The follow is illegal because ob 
    // is an Integer Containment and 9.25 is 
    // a Double value. 
//    if(ob.contains(9.25)) // Illegal! 
//      System.out.println("9.25 is in ob"); 
 
  }
}
