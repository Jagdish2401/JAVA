import java.util.*;
class Rectangle
{
    double length;
    double breath;
    Rectangle(){}
    Rectangle(double l,double b)
    {
        length=l;
        breath=b;
    }
    public void area()
    {
        System.out.print("area:"+length*breath);

    }
    
    public void perimeter()
    {
        System.out.println(" perimeter :"+2*(length+breath));
    }

}
class square extends Rectangle
{
    square(){}
    square(int s)
    {
        super(s,s);
    }

}
public class Pra3 {
    public static void main(String[] args) {
        Rectangle o1=new Rectangle(4,5);
        System.out.println("area for rectangle");
        o1.area();
        o1.perimeter();
        System.out.println("area for square");
        square s1=new square(4);
        s1.area();
        s1.perimeter();
        square[] arr=new square[5];
        int k=1;
        System.out.println("using array of object");
        for(int i=0;i<5;i++)
        {
            arr[i]=new square(k);
            k++;
            System.out.print("area for square=");
            arr[i].area();
            arr[i].perimeter();
        }   
    }
}
