
import java.util.*;

public class HigestAndLowestTreeSet {
    public static void main(String args[])
    {     
        TreeSet<Integer> set = new TreeSet<Integer>(); 
        set.add(10);
        set.add(20);
        set.add(11);
        set.add(01);
        set.add(50);
        set.add(40);
        set.add(90);
        set.add(162);
        
        System.out.println("Elements of the treeset are: " + set);    
        System.out.println("Highest Value: " + set.pollLast()); 
        System.out.println("Lowest Value: " + set.pollFirst());
                                                                
        }       


    }
