public class JavaIsAliveExp extends Thread   
{  
    public void run()  
    {  
        try   
        {  
            Thread.sleep(300);  
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (InterruptedException ie) {  
        }  
    }  
    public static void main(String[] args)  
    {  
        JavaIsAliveExp t1 = new JavaIsAliveExp();  
        System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
    }  
}  
