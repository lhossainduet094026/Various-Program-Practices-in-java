/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Jack Sparrow
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Stack<String> stck = new Stack<String>();//works in LIFO strategy
      stck.push("lokman");
      stck.push("masud");
      stck.push("kabir");
      stck.push("alamin");
      stck.push("kabir");
        System.out.println(stck); 
 
         Iterator itr = stck.iterator();
        System.out.println("------------LIfO strategy-------------------");
        while(itr.hasNext())
        {
        System.out.println(stck.pop());
        
        }    
    }
    
}
