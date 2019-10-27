/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
    ArrayList<String> someList= new ArrayList<String>();
    someList.add("tanjina");
    someList.add("salman");
    someList.add("asif");
    someList.add("asif");
   /* 
    for(String lst:someList)
    {
         System.out.println(lst);
    }*/
   Iterator itr = someList.iterator();
   while(itr.hasNext())
   {
        System.out.println(itr.next());
   }
   
    }
    
}
