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
public class GenArrays {
    public static void main(String args[]) {  
    Integer n[] = { 1, 2, 3, 4, 5 };   
 
    Gen<Integer> iOb = new Gen<Integer>(50, n); 
 
    // Can't create an array of type-specific generic references. 
    // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong! 
 
    // This is OK. 
    Gen<?> gens[] = new Gen<?>[10]; // OK
  }
}
