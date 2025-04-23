import java.util.*;
class Compare
{
    public static void main(String[] args) throws Exception {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a city name");
        str=sc.nextLine();
        if(str.length()>5)
        {
            throw new Exception("Out of limit");
        }
        else
        {
            System.out.println("In the limit"+str);
        }
        sc.close();

    }
}