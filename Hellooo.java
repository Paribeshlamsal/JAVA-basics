import java.lang.*;
class Distance
{
    private int feet;
    private int inch;
    Distance(int f,int i,int f1,int i1)
    {
        feet=f;
        inch=i;

    }
    public void addDistance()
    {
        int distance=(feet*12+inch)-(f1*12+i1);
        System.out.println(distance);
    }
    public void subtractDistance()
    {
        int dis=feet*12-inch;
        System.out.println(dis);
        
    }
    public void displayDistance()
    {
        System.out.println("The distance in feet is"+feet+"and in inch is"+inch);
    }
}
class Hellooo
{
    public static void main(String args[])
    {
        Distance d=new Distance(5,25,4,30);
        d.addDistance();
    }
}