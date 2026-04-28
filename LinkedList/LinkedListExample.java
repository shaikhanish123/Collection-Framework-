package LinkedList;
import java.util.Iterator;
import java .util.LinkedList;

public class LinkedListExample {
    public static void main(String []args){
        LinkedList<String> lst=new LinkedList<>();
        lst.add("akshay");
        lst.add("krishna");
        lst.add("anish");
        lst.add("apkeha");
        lst.add("prahmesh");
        lst.add("jagurti");
       Iterator<String>itr  =lst.iterator();
       while(itr.hasNext()){
System.out.println(itr.next());
       }
    }

    
}
