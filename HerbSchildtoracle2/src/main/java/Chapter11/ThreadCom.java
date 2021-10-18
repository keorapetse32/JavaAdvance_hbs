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
public class ThreadCom {
    public static void main(String args[]) { 
    TickTock tt = new TickTock(); 
    //MyThread mt1 = MyThread.createAndStart("Tick", tt); 
   //MyThread mt2 = MyThread.createAndStart("Tock", tt); 
 
    //try { 
     // mt1.thrd.join(); 
      //mt2.thrd.join(); 
    //} catch(InterruptedException exc) { 
      System.out.println("Main thread interrupted."); 
    } 
  } 
//}
