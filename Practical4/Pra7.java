import java.util.*;
interface shape{
    String getcolor();
    double getarea();
    void text();

}
class circal implements shape
{
    double r;
    String color;
    void fun1(double r,String color)
    {
        this.r=r;
        this.color=color;
    }
    public double getarea()
    {
        double area;
        area=3.14*r*r;
        return area;
    }
    public String getcolor()
    {
        return color;
    }
    public void text()
    {
        System.out.println("this shape is circal and area is"+getarea()+" color is "+getcolor());
    }
}
class rectangle implements shape
{
    double l,b;
    String color;
    void fun1(double l,double b,String color)
    {
        this.l=l;
        this.b=b;
        this.color=color;
    }
    public double getarea()
    {
        double area;
        area=l*b;
        return area;
    }
    public String getcolor()
    {
        return color;
    }
    public void text()
    {
        System.out.println("this shape is rectangle and area is"+getarea()+" color is "+getcolor());
    }
}

public class Pra7 
{
    public static void main(String[] args) 
    {
        circal o1=new circal();
        o1.fun1(5,"blue");
        rectangle r1=new rectangle();
        r1.fun1(5, 02,"red");
        o1.text();
        r1.text();
    }
    
}
