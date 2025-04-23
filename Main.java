class Multiplication
{
    public void mul(int n){
        for(int i=1;i<=10;i++)
        {
        System.out.println(n*i);
        }
    }
}
class ThreadFirst extends Thread{
    Multiplication c;

    public ThreadFirst(Multiplication c){
        this.c=c;

    }
    public void run(){
        c.mul(5);
    }
}
class ThreadSecond extends Thread{
    Multiplication c;

    public ThreadSecond(Multiplication c){
        this.c=c;

    }
    public void run(){
        c.mul(10);
    }
}

public class Main{
    public static void main(String args[]){
        Multiplication c=new Multiplication();
        ThreadSecond t2=new ThreadSecond(c);
        t2.start();

        ThreadFirst t1=new ThreadFirst(c);
        t1.start();
       
    }
} 
