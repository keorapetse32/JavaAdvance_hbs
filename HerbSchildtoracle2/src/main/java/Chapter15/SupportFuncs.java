/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15;

/**
 *
 * @author keora
 */
public class SupportFuncs {
    // Determine if a is a factor of b. 
  public static boolean isFactor(int a, int b) { 
    if((b%a) == 0) return true; 
    return false; 
  }
}
