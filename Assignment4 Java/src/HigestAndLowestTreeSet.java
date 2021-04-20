
import java.util.*;

public class HigestAndLowestTreeSet {
    public static void main(String args[])
    {     
        TreeSet<Integer> set = new TreeSet<Integer>(); 
        set.add(12);
        set.add(85);
        set.add(70);
        set.add(90);
        set.add(81);
        set.add(30);
        set.add(101);
        set.add(11);
       
        System.out.println("Elements of the treeset are: " + set);
       
        System.out.println("Highest Value: " + set.pollLast()); 
       
        System.out.println("Lowest Value: " + set.pollFirst());
                                                                
        }       


    }
