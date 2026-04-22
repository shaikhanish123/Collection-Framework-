package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String args[]){
        ArrayList<String>lst=new ArrayList<>();
        lst.add("ammar");
        lst.add("khan");
        lst.add("abid");
        lst.add("sarthak");
        lst.add("harsh");
        lst.add("sahil");
        lst.add("ayush");
//add at the specific index
// lst.add(2,"gold");
// get element at the specific index
// System.out.println(lst.get(2));
// set element at the specific index
// lst.set(0,"danish");
//lst.remove(2);
// total size of element 
// System.out.println("total size of list:"+lst.size());
// to chec the element empty or not
// System.out.println(lst.isEmpty());
//clear the list
// lst.clear();
// System.out.println("after clear the list:"+lst);
// sort the list

 Collections.sort(lst);
 
 System.out.println("after sorting the list:"+lst);
        System.out.println(".........");
        for (String string : lst) {
            System.out.println(string);
        }
    


    }
    
}
