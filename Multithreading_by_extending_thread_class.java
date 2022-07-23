class Mythread extends Thread
{
    public void run()
    {
            int i=0;
            while(i< 400)
            {
               System.out.println("thread is running and i am happy.");
               System.out.println("thread is running.");
               if(i==100)
               try
               {
                  sleep(2000);
               }
               catch(Exception e)
               {
                
               }
               i++;
            }
    }
              
}
class Mythread1 extends Thread
{
    public void run()
    {
            int i=0;
            while(i< 400)
            {
               System.out.println("i am happy.");
               System.out.println("i am java.");
               if(i==50)
               {
                   yield();
               }
               else if(i==100)
               {
                   stop();
               }
               i++;
            }
    }
              
}
public class Main {
    public static void main(String args[])
    {
     
         Mythread ob=new Mythread();
        
        Mythread1 ob1=new Mythread1();
        ob.start();
        ob1.start();
    }
    
}
