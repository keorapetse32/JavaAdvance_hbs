/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

enum Transport {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
}

/**
 *
 * @author keora
 */
public class EnumDemo2 {
    public static void main(String args[])  
  { 
    Transport tp; 
 
    System.out.println("Here are all Transport constants"); 
 
    // use values() 
    Transport allTransports[] = Transport.values(); 
    for(Transport t : allTransports) 
      System.out.println(t); 
 
    System.out.println(); 
    
    // use valueOf() 
    tp = Transport.valueOf("AIRPLANE"); 
    System.out.println("tp contains " + tp); 
 
  }
}
