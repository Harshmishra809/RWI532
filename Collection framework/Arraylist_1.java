import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Arraylist_1 {


    public static void main (String[]args) {

        ArrayList<Integer > list = new ArrayList();
        list.add(20);        // add method
        list.add(10);   
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.add(60);
        System.out.println(list);

    list.add(3, 90);  // add element in between
    System.out.println(list);

    list.remove(4);           // remove method
    System.out.println(list);

    int element = list.get(2);  // get method
    System.out.println(element);

    list.set(0,40); // set method
    System.out.println(list);

    int size = list.size();
    System.out.println(size);  // size method 

    // for loop in array list 

    for (int i =0;i<list.size();i++) {

        System.out.println(list.get(i));

    }

    
    System.out.println(); 

    Iterator <Integer> it =list.iterator();
    while(it.hasNext()) {       // it.hasNext Method

        System.out.println("iterator"+it.next());
    }


    // sorting method in Arraylist 

    Collections.sort(list);
    System.out.println(list);

    // Iterator  method 

    
        

    


    }
}