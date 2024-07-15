import java.util.*;
class Tringlearea{
    double area;
    Tringlearea()
    {
        area=15;
    }
    Tringlearea(double r)
    {//area for circle
        area=3.14*r*r;
        System.out.println("area for circcle:"+area);

    }
    Tringlearea(double b,double h)
    {
        area=(b*h)/2;
        System.out.println("area for tringle:"+area);
    }
}
public class Pra2 {
    public static void main(String[] args) {
        Tringlearea o1=new Tringlearea();
        Tringlearea o2=new Tringlearea(10);
        Tringlearea o3=new Tringlearea(10.5f,10.5);
        
    }
    
}
