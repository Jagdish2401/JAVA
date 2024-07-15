import java.util.*;
public class Pra7 {


    public static void main(String[] args) 
       { Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println("String length:"+s.length());
        String s1=s.replace('h', 'n');
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        String sub=s.substring(0, 8);
        System.out.println(sub);
        sc.close();
       }
}
