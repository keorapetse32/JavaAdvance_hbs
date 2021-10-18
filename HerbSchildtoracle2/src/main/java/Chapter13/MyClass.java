/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

interface Containment<T> { 
  // The contains() method tests if a 
  // specific item is contained within 
  // an object that implements Containment. 
  boolean contains(T o); 
}

/**
 *
 * @author keora
 */
public class MyClass<T> implements Containment<T> {
    T[] arrayRef; 
 
  MyClass(T[] o) { 
    arrayRef = o; 
  } 
 
  // Implement Contains. 
  public boolean contains(T o) { 
    for(T x : arrayRef) 
      if(x.equals(o)) return true; 
    return false; 
  }
}
