
class A{
    static int  x=10;
}
class B extends A
{
     int x=20;
    void display()
    {
        System.out.println("class B value of x: "+x);
        System.out.println("class A value of x: "+super.x);
    }
}
public class Pra4 {
    public static void main(String[] args) {
        B a=new B();
        a.display();  
    }
}
