class A extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<=10;i++)
            {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        A t=new A();
        t.start();

        for(int i=0;i<=10;i++)
            {
                System.out.println("Hello");
            }
    }
}
