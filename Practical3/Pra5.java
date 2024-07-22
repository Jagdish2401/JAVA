import java.util.*;

class area
{
    int area;
    area(int l,int b)
    {
        area=l*b;
    }
    public int display(){
        return area;
    }

}


public class Pra5 {
    public static void main(String[] args) {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rectangl length:");
        l=sc.nextInt();
        System.out.println("Enter Rectangl breath:");
        b=sc.nextInt();

        area o1=new area(l, b);
        System.out.println("area:"+o1.display());
        
    }
}
