class Mythread implements Runnable
{
    public void run()
    {
            int i=0;
            while(i< 400)
            {
               System.out.println("thread is running and i am happy.");
               System.out.println("thread is running.");
               i++;
            }
    }
              
}
class Mythread1 implements Runnable
{
    public void run()
    {
            int i=0;
            while(i< 400)
            {
               System.out.println("i am happy.");
               System.out.println("i am java.");
               i++;
            }
            
    }
              
}
public class Main {
    public static void main(String args[])
    {
          Mythread ob=new Mythread();
          Thread  o= new Thread(ob);
          Mythread1 ob1=new Mythread1();
          Thread  o1= new Thread(ob1);
          o.start();
          o1.start();
    }
    
}
