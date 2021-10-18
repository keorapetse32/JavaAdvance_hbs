/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author keora
 */
public class TickTock {
    String state; // contains the state of the clock
 
  synchronized void tick(boolean running) { 
    if(!running) { // stop the clock 
      state = "ticked";
      return; 
    } 
 
    System.out.print("Tick "); 

    state = "ticked"; // set the current state to ticked
  } 
 
  synchronized void tock(boolean running) { 
    if(!running) { // stop the clock 
      state = "tocked";
      return; 
    } 
 
    System.out.println("Tock"); 

    state = "tocked"; // set the current state to tocked
  }
}
