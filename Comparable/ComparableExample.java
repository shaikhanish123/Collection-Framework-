package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample{

    public static void main(String[] args) {
         ArrayList<Emp>emplist=new ArrayList<>();
         emplist.add(new Emp(1,"john","usa"));
         emplist.add(new Emp(3,"johan","atif"));
emplist.add(new Emp(2,"anish","us"));    

System.out.println("before sorting the object"+emplist);
Collections.sort(emplist);
System.out.println(" after  sorting the object"+emplist);
    }
   



}
