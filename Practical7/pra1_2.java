
public class pra1_2 implements Runnable 
{
    public void run()
    {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        pra1_2 ob=new pra1_2();
        Thread th=new Thread(ob);
        th.start();
    }
}


