import java.util.TreeSet;
public class TreeSet_1 { 
    public static void main(String[] args) {
        TreeSet<Integer>set = new TreeSet<>();
        set.add(40);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);  // print value in sorted form

        set.remove(40);  // remove method
        System.out.println(set);

        System.out.println(set.isEmpty());   // is empty method

        System.out.println(set.size());
        System.out.println(set.contains(40));   // contains method
        
        
    }
    
}
