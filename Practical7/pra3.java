import java.util.*;
class myThread1 implements Runnable{
    int n,t;
    int th[]=new int[100];
    myThread1(int a,int b,int c[])
    {
        n=a;
        t=b;
        th=c;
    }
    public void run()
    {
        for(int i=1;i<=t;i++)
        {
            System.out.println("The consecutive Thread is:");
            System.out.println(th[i]);
        }
    }
}
public class pra3 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int n=sc.nextInt();
            System.out.println("enter number of theads");
            int t=sc.nextInt();
            int a[]=new int[100];
            a[1]=n/t;
            int sum=0;
            for(int i=0;i<t;i++)
            {
                a[i]=a[1];
                sum+=a[i];
            }
            a[t]=n-sum;
            myThread1 m=new myThread1(n,t,a);
            Thread b=new Thread(m);
            b.start();
        }
        catch(Exception e){}
    }
    
}
