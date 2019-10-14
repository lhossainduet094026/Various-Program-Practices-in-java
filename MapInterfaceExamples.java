package mapinterfaceexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceExamples {
    public static void main(String[] args) {
       Map<String,String> map = new HashMap<>();
       map.put("name", "lokman");
       map.put("country", "Bangladesh");
       map.put("dist", "jhalokathi");
       //In Set we can repeat values but not keys because it will replace 
       System.out.println(map);//output is not in any order because hashmap never give any order list.
        
       Set<String> keys= map.keySet();// map.keySet() returns the set of keys.
       
       for(String key:keys)//Iteration using set of keys
       {
         System.out.println(key+": "+map.get(key));
       }  
    }
    
}
