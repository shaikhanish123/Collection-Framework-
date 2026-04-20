package ArrayList;
import java.util.ArrayList;
public class CollectionExample{
    public static void main(String args[]){
        ArrayList<String> lst=new ArrayList<>();
        lst.add("sanjay");
        lst.add("amit");
        lst.add("raman");
        lst.add("sahara");
        lst.add("balloon");
        for (String string : lst) {
            System.out.println(string);
        }
        
    }

}