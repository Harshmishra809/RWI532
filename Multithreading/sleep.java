// Sleep Method in  thread

class A extends Thread {

    public String setName;

    public void run() {

        String n = Thread.currentThread().getName();
        for (int i =1;i<=3;i++) {
            System.err.println(n);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    


        }
 


    }
}

public class sleep{

    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3  = new A ();

        t1.setName = ("thread 1");
        t2.setName= ("thread 2");
        t3.setName = ("thread3");
        t1.start();
        t2.start();
        t3.start();
        

    }
}
