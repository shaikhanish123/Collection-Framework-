package HashsetMethod;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
       hs.add("akash");
       hs.add("kaveri");
       hs.add("akash");
         System.out.println("before clone the hashet:"+hs);
        // hs.clear();
        //clone() method
        // HashSet<String> hs1=(HashSet<String>)hs.clone();
        // System.out.println("after clone:"+hs1);
        System.out.println(hs.contains("kaveri"));

        // System.out.println("after clear:"+hs);


    
   

}
}
