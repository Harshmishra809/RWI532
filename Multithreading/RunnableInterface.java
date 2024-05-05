 //  thread implementing by RunnableInterface 
 
 class Runnable{
    public void run()


    {
        for (int i=1;i<5;i++){

            System.err.println("My child Thrad");
        }


    }
    

    
}
 public class RunnableInterface {

    public static void main(String[] args) {
        Runnable  r =  new Runnable();
     Thread t = new Thread();
     t.start();
     for (int i=1;i<5;i++){

        System.err.println(" MainThrad");
    }



    
    }
}
