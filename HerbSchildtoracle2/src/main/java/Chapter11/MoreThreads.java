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
public class MoreThreads {
    public static void main(String args[]) { 
    System.out.println("Main thread starting."); 
 
    MyThread mt1 = MyThread.createAndStart("Child #1"); 
    MyThread mt2 = MyThread.createAndStart("Child #2"); 
    MyThread mt3 = MyThread.createAndStart("Child #3"); 
 
    do { 
      System.out.print("."); 
      try { 
        Thread.sleep(100); 
      } 
      catch(InterruptedException exc) { 
        System.out.println("Main thread interrupted."); 
      } 
    } while (mt1.thrd.isAlive() || 
             mt2.thrd.isAlive() || 
             mt3.thrd.isAlive()); 
 
    System.out.println("Main thread ending."); 
  }
}
