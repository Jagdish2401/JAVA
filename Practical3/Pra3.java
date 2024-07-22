import java.util.*;

class Employee{
    String fname,lname;
    double salary;
   public void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
         fname=sc.nextLine();
        System.out.println("Enter last name:");
         lname=sc.nextLine();
        System.out.println("Enter salary:");
         salary=sc.nextDouble();
        if(salary<0){
            salary=0.0;

        }
    }
    public void get(){
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(salary);
    }
    public double raise(double percentage)
    {
        double raise;
        raise=(percentage*salary)/100;
        salary=salary+raise;
        return salary;

    }
}


public class Pra3
{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.set();
        e1.get();
        System.out.println("final salary:"+e1.raise(10));
    }

}