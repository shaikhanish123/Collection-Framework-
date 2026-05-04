package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main{

    public static void main(String[] args) {

     ArrayList<Emp>lst=new ArrayList<>();
        lst.add(new Emp(1,"Alice","10000","mumbai"));
        lst.add(new Emp(2,"Bob","120000","up"));
        lst.add(new Emp(3,"Charlie","46000","punjab"));
        lst.add(new Emp(4,"David","18900","Delhi"));
        lst.add(new Emp(5,"Eve","237000","kerla"));
        // Collections.sort(lst,new IdComparator());
        // Collections.sort(lst,new SalaryComparator());
       Collections.sort(lst,new AddComparator());
    //    System.out.println(lst+"sorted by address");
        System.out.println("sorted by address: " + lst);
    
    }

}