import java.lang.*;

class Odd extends Thread
{
    public void run()
    {
        for(int i=101;i<200;i+=2)
        {
            System.out.println(i);
        }
    }
}
class Even extends Thread
{
    public void run()
    {
        for(int i=100;i<200;i+=2)
        {
            System.out.println("The numbers even are;");
            System.out.println(i);
        }
    }
}
class Mainnn
{
    public static void main(String args[])
    {
        Odd o=new Odd();
        Even e=new Even();
        o.start();
        e.start();
    }
}