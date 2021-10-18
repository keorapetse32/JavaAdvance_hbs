/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.io.*;

/**
 *
 * @author keora
 */
public class CompFiles {
    public static void main(String args[])
  {
    int i=0, j=0;

    // First make sure that both files have been specified.
    if(args.length !=2 ) {
      System.out.println("Usage: CompFiles f1 f2");
      return;
    }

    // Compare the files.
    try (FileInputStream f1 = new FileInputStream(args[0]);
         FileInputStream f2 = new FileInputStream(args[1]))
    {
      // Check the contents of each file.
      do {
        i = f1.read();
        j = f2.read();
        if(i != j) break;
      } while(i != -1 && j != -1);

      if(i != j)
        System.out.println("Files differ.");
      else
        System.out.println("Files are the same.");
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  } 
}
