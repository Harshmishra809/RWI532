import java.util.LinkedHashSet;

public interface LinkHashSet_1{
    public static void main(String[] args) {
    LinkedHashSet<Integer> set = new LinkedHashSet <>() {
        
    };
        set.add(20);   // add method  
        set.add(40);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(50); 

        System.out.println(set);   // generate value in same order
        set.remove(40);
        System.out.println(set);  // remove method

        System.out.println(set.contains(40));
        System.out.println(set.size()); // size method

     set.clear();
     System.out.println(set);   // clear method

        
    }

    
}
