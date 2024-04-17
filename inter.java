interface  Harsh {

    


 void  show();  // public abstract method
   
}
 public class inter implements Harsh 
    {

      public  void show() {

            System.out.println( "2");
        }
        public static void main(String[] args) {
            inter t = new inter ();
            t.show();
            
        }
    }


