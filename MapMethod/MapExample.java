package MapMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample{
public static void main(String[] args) {
    Map <Integer, String>map=new HashMap<>();
    map.put(1,"shaikh");
    map.put(2,"gharat");
    map.put(2,"krishna");
    
    //System.out.println(map);
//    Set set = map.entrySet();
//  Iterator itr=  set.iterator();
//  while(itr.hasNext()){
//    Entry entry=(Entry) itr.next();
//    System.out.println(entry.getKey()+" : "+entry.getValue());
// for (Entry<Integer,String>entry:map.entrySet()) {
//   System.out.println(entry.getKey()+"  "+entry.getValue());
// }

 for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }

}
