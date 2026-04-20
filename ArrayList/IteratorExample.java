package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String args[]){
        List <String>itr=new ArrayList<>();
        itr.add("Anish");
        itr.add("king");
        itr.add("Danish");
        itr.add("Boys");
    Iterator<String> iterator=itr.iterator();
    while(iterator.hasNext()){
   System.out.println(iterator.next());
    }
        


    }
    
}
