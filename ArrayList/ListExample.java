package ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String [] args){
        List <String>lst=new ArrayList<>();
        lst.add("Hello");
        lst.add("byy");
        lst.add("vinod");
        lst.add("abid");

 Iterator itr=lst.iterator();
 while(itr.hasNext()){
    System.out.println(itr.next());

    }
}
}
