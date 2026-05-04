package Comparator;

import java.util.Comparator;

public class SalaryComparator  implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
    
   
