/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

interface IntPredicate { 
  boolean test(int n); 
}

/**
 *
 * @author keora
 */
public class MyIntNum {
    private int v; 
 
  MyIntNum(int x) { v = x; } 
 
  int getNum() { return v; } 
 
  // Return true if n is a factor of v. 
  boolean isFactor(int n) { 
    return (v % n) == 0; 
  }
}
