/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author keora
 */
public class MethodRefDemo3 {
    public static void main(String args[]) 
  { 
    boolean result; 
 
    MyIntNum myNum = new MyIntNum(12); 
    MyIntNum myNum2 = new MyIntNum(16); 
 
    // This makes inp refer to the instance method isFactor(). 
    MyIntNumPredicate inp = MyIntNum::isFactor; 
 
    // The following calls isFactor() on myNum. 
    result = inp.test(myNum, 3); 
    if(result) 
      System.out.println("3 is a factor of " + myNum.getNum()); 
 
    // The following calls isFactor() on myNum2. 
    result = inp.test(myNum2, 3); 
    if(!result) 
      System.out.println("3 is a not a factor of " + myNum2.getNum()); 
  }
}
