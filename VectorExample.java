package vectorexample;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
      Vector<String> vr=new Vector<String>();//vector is synchoronised
      vr.add("masud");
      vr.add("lokman");
      vr.add("sumon");
      vr.add("sumon");
        //System.out.println(vr);
      Iterator itr = vr.iterator();
      while(itr.hasNext())
      {
          System.out.println("Name:"+itr.next().toString());
      }
      
    }
    
}
