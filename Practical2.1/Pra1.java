import java.util.Scanner;
public class Pra1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s =sc.nextLine();
        System.out.println("How many time you have print :");
        int i=sc.nextInt();
        String result = front_time(s,i);
        System.out.println(result);
        sc.close();
    }
    public static String front_time(String str,int n)
    {
        String result="";
        String s1=str.substring(0,3);
        for(int i=0;i<n;i++)
        {
            result=result+s1;
        }
        return  result;

    }
}
