   //  Create thread By extending thread class
   
   
   class a extends Thread {

    @overide


    public void run() {
        for (int  i =0;i<=5;i++) {

            System.err.println("Harsh");
        }
    }


    
}
  public class extending {

    public static void main(String[] args) {
        a t = new a() ;
        t.start();

        for (int i =0;i<=5;i++) {

            System.err.println("dev");
        }

    }
}