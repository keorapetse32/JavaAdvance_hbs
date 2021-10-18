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
public class ConstructorRefDemo {
    public static void main(String args[]) 
  { 
    // Create a reference to the MyClass constructor. 
    // Because func() in MyFunc takes an argument, new 
    // refers to the parameterized constructor in MyClass, 
    // not the default constructor. 
    MyFunc myClassCons = MyClass::new; 
 
    // Create an instance of MyClass via that constructor reference. 
    MyClass mc = myClassCons.func("Testing"); 
 
    // Use the instance of MyClass just created. 
    System.out.println("str in mc is " + mc.getStr( )); 
  }
}
