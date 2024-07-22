//import java.lang.reflect.Array;
import java.util.*;

public class Pra6
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println("String length:"+s.length());
        System.out.println("current string in lower case:"+s.toLowerCase());
        System.out.println("current string in upper case:"+s.toUpperCase());
        System.out.println("to reverse the string:");
        //Reverse
        char[] ch1=s.toCharArray();
        System.out.println(ch1);
        for(int i=ch1.length-1;i>=0;i--)
        {
            System.out.print(ch1[i]);
        }
        //sort
        char[] ch2=ch1;
        System.out.println("");
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));

        
    }
    
}
