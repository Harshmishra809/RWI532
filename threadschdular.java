// threadschdular in java

class A extends Thread {

    public String setName;

    public void run() {

        String n = Thread.currentThread().getName();
        for (int i =1;i<=3;i++) {
            System.err.println(n);


        }


    }
}

public class threadschdular {

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
