package demos;
class RunnableThread implements Runnable 
{
    Thread RunningThread;
    public RunnableThread()
    {
        
    }
    public RunnableThread(String ThreadName)
    {
        RunningThread = new Thread(this,ThreadName);
        System.out.println(RunningThread.getName());
        RunningThread.start();
    }
    public void run()
    {
        System.out.println(Thread.currentThread());
        
    }
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new RunnableThread(),"thread1");
        Thread thread2 = new Thread(new RunnableThread(),"thread2");
        Thread thread3 = new Thread("thread3");
        
        thread1.start();
        thread2.start();
        try
        {
            Thread.currentThread().sleep(1000);
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread());
        
    }
}