//call by refreance
class obj{
    int value;
    
}
public class Pra7_2 {
    public static void main(String[] args)
     {
        obj o1=new obj();
        o1.value=10;
        callrefre(o1);
        System.out.println(o1.value);
    }
    public static void callrefre(obj o)
    {
        o.value=20;
    }
}
