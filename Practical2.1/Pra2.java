import java.util.Scanner;
public class Pra2 {
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
        int count=array_count(array,length);
        sc.close();
        System.out.println(count);
    }

    public static int array_count(int[] array1,int length) {
        int count=0;
        int l=length;
        for(int i=0;i<l;i++)
        {
            
            if(array1[i]==9)
            {
                count++;
            }
        }
        return count;
        
    }
}
