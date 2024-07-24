//return value
class obj
{
    int value;
}
public class Pra7_3 {

    public static void main(String[] args)
     {
        obj o1=new obj();
        o1.value=10;
       System.out.println("return value:"+retun(o1)); ;
        System.out.println("after calling function value:"+o1.value);
    }
    public static int  retun(obj o)
    {
        o.value=20;
        return o.value;
    }
}
