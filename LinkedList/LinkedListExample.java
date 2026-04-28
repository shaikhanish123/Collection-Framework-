package LinkedList;
import java.util.Iterator;
import java .util.LinkedList;

public class LinkedListExample {
    public static void main(String []args){
        LinkedList<String> lst=new LinkedList<>();
        // add meethod
        lst.add("akshay");
        lst.add("krishna");
        lst.add("anish");
        lst.add("apkeha");
        lst.add("prahmesh");
        lst.add("jagurti");
        // addfirst method
        //lst.addFirst("modi");
        // addlast method
        // lst.addLast("dhruv");
        // add index method
       // lst.add(2, "rahul");
       // remove method
      // lst.remove("modi");
      // remove index method
       //lst.remove(2);
       // clear method
    //    System.out.println("before clear method");
    //    lst.clear();
    //    System.out.println("after  clear method"+lst);

       Iterator<String>itr  =lst.iterator();
       while(itr.hasNext()){
System.out.println(itr.next());
       }
    }

}
