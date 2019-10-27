/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Jack Sparrow
 */
public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList<String> al=new LinkedList<String>();  
       al.add("Ravi");  
       al.add("Vijay");  
       al.add("Ravi");  
       al.add("Ajay");  
     Iterator<String> itr=al.iterator();  
     while(itr.hasNext())
     {  
        System.out.println(itr.next());  
     }  
} 
    
}
