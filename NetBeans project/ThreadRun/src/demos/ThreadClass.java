package demos;
class ThreadClass extends Thread
{
    ThreadClass()
    {
        
    }
    ThreadClass(String ThreadName)
    {
        super(ThreadName);
        System.out.println(this);
        start();
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new ThreadClass(),"thread1");
        Thread thread2 = new Thread(new ThreadClass(),"thread2");
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();
        Thread thread5 = new Thread("thread5");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        try
        {
            Thread.currentThread().sleep(1000);
            
        }
        catch(InterruptedException e)
        {
            
        }
        System.out.println(Thread.currentThread());
        
        
    }    
           
}