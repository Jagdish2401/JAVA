import java.util.Scanner;
public class Pra6 {
    public static void main(String[] args) 
    {
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int revrse= 0;
        while (number!=0) {
            int digit = number%10;
             revrse = (revrse*10)+digit;
             number=number/10;
        }
        System.out.println("this is revrse number"+revrse);
        
    }
    
}
