import java .util.LinkedList;

public class Linklist {

    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>  ();
        name.add ("Harsh");   // add method
        name.add("sahil");
        name.add("jatin");
        name.add("Lucky");
        System.err.println(name);

        name.addFirst("Rohit");
        name.addLast("vicky");
        System.out.println(name);
        name.add(3, "Rahul");
        System.out.println(name);

        name.remove(3);  // remove method
        System.out.println(name);
        name.removeFirst();
        System.out.println(name);
        name.removeLast();
        name.set(3, "raj");  // set method

        name.contains("aditya");
        System.out.println(name.contains("aditya"));  // contains Method
        System.out.println(name);
        System.out.println(name); 

                                  // for each loop
           for(String str:name)
           {

            System.out.println(str);
           }
        
    }
    
}
