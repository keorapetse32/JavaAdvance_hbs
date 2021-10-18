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
public class JoinThreads {
    public static void main(String args[]) {
    System.out.println("Main thread starting.");

    MyThread mt1 = MyThread.createAndStart("Child #1");
    MyThread mt2 = MyThread.createAndStart("Child #2");
    MyThread mt3 = MyThread.createAndStart("Child #3");

    try {
      mt1.thrd.join();
      System.out.println("Child #1 joined.");
      mt2.thrd.join();
      System.out.println("Child #2 joined.");
      mt3.thrd.join();
      System.out.println("Child #3 joined.");
    }
    catch(InterruptedException exc) {
      System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread ending.");
  }
}
