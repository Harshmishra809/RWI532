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
        name.set(3, "raj"); // set method
      
        System.out.println(name);

        name.contains("aditya");
        System.out.println(name.contains("aditya"));  // contains Method
        System.out.println(name);
        System.out.println(name); 


                                  // for each loop
           for(String str:name)
           {

            System.out.println(str);
           }
          System.out.println("element at first index is"+ name.getFirst());   //  get first 
          System.out.println("element  at last index is  "+ name.getLast());   // get last

          System.out.println("remove first element"+ name.pollFirst());  // poll FIrst
          System.out.println("remove first element"+ name.pollLast());  // poll FIrst
          System.out.println(name.peek());  // peek 

        


        
    }
    
}
