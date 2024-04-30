public class YieldExp extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        YieldExp t1 = new YieldExp();  
        YieldExp t2 = new YieldExp();  
        
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
        
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
}  
