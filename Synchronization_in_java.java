class Pyramid
{
    synchronized void drawPyr(char ch)
    {
        for(int i=0;i<10;i +=2)
        {
            for(int k=10-i;k>0;k -=2)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}

class A extends Thread{
    
    Pyramid P;
    A(Pyramid P)
    {
        this.P=P;
    }
    public void run()
    {
        P.drawPyr('*');
    }
}

class B extends Thread{
    
    Pyramid P;
    B(Pyramid P)
    {
        this.P=P;
    }
    public void run()
    {
        P.drawPyr('#');
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Pyramid Pobj=new Pyramid();
		A tA = new A(Pobj);
		B tB = new B(Pobj);
		
		tA.start();
	    tB.start();
	}
}
