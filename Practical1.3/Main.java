
public class Main {
    public static void main(String[] args) {
        double x=1234.5678;
        long y=(long)x;
        System.out.println("This vlaue is "+y);
        double z=(x-y)*10000;
        int a=(int)z;
        System.out.println("this value is"+a);
        System.out.println(+y+"."+a);

    }
    
}
