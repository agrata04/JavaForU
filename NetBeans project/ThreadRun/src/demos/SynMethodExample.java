/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author Agrata
 */
public class SynMethodExample extends Thread {

    /**
     * @param args the command line arguments
     */
    static int id = 34;
    SynMethodExample(String t)
    {
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        SynMethodExample thread1 = new SynMethodExample("thread1");
        SynMethodExample thread2 = new SynMethodExample("thread2");
        thread1.start();
        thread2.start();
        
    }
        
    @Override
        public synchronized void run()
        {
          SynMethod.display(Thread.currentThread().getName(), id);
          
        }
        
    
}
