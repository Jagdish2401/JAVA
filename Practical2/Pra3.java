
import java.util.Scanner;

public class Pra3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int length=sc.nextInt();
        System.out.println("Enter array alement");
        int[] array=new int[length];
        for(int i=0;i<length;i++)
        {
            array[i]=sc.nextInt();
        }
        boolean flage=array_count(array);
        sc.close();
        System.out.println(flage);
        
    }
    

public static boolean array_count(int[] array1) 
{
    boolean flage=false;
    for(int i=0;i<4;i++)
    {
        if(array1[i]==9)
        {
            flage=true;

        }
    }
    return flage;

}
}