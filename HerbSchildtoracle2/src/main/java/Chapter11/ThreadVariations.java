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
public class ThreadVariations {
    public static void main(String args[]) {
    System.out.println("Main thread starting.");

    MyThread mt = MyThread.createAndStart("Child #1");

    for(int i=0; i < 50; i++) {
      System.out.print(".");
      try {
        Thread.sleep(100);
      }
      catch(InterruptedException exc) {
        System.out.println("Main thread interrupted.");
      }
    }

    System.out.println("Main thread ending.");
  }
}
