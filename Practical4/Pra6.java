import java.util.*;
interface p1
{
    int CONSTANT_a =10;
    void fun1();
}
interface p2{
    int CONSTANT_b=20;
    void fun2();
}
interface p12 extends p1,p2
{
    void fun3();
}

class Q implements   p12
{
    public void fun1()
    {
        System.out.println("interface p1:"+CONSTANT_a);
    }
    public void fun2()
    {
        System.out.println("interface p2:"+CONSTANT_b);   
    }
    public void fun3()
    {
        System.out.println("interface in p12");
    }

}
public class Pra6 {
    public static void main(String[] args)
    {
        Q q=new Q();
        q.fun1();
        q.fun2();
        q.fun3();

    }
}
