package Comparator;

import java.util.Comparator;

public class AddComparator  implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getAdd().compareTo(o2.getAdd());
    }
    
}
