
public class pra2 implements Runnable 
{
    public void run()
    {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        pra2 ob=new pra2();
        Thread th=new Thread(ob);
        th.start();
    }
}


