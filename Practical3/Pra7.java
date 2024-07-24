//pass by value
import java.util.*;
public class Pra7 
{
    public static void main(String[] args)
     {
        int x=10;
        System.out.println("before calling function"+x);
        fun1(10);
        System.out.println("after calling function:"+x);
    }
    
    public static void fun1(int a)
    {
        a=20;
        System.out.println(a);

    } 
}
