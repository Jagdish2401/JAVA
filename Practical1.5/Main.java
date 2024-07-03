import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        int[] code={1,2,3,4,5};
        float[] tax={8,12,5,7.5F,3};
        String[] str={"motor","fan","tublight","wire","other"};
        int[] price={100,200,300,400,500};

        for(int i=0;i<5;i++)
        {
            System.out.println(code[i] +" is for "+ str[i]);

        }
        System.out.println("Enter your choise");
        Scanner sc =new Scanner(System.in);
        int c=sc.nextInt();
        int rs;
        switch (c) {
            case 1:
            rs=(int)(price[c-1]+(price[c-1]*tax[c-1])/100);
            System.out.println(rs); 
                break;
             case 2:
            rs=(int)(price[c-1]+(price[c-1]*tax[c-1])/100);
            System.out.println(rs); 
                break;
            case 3:
                rs=(int)(price[c-1]+(price[c-1]*tax[c-1])/100);
                System.out.println(rs); 
                    break;
            case 4:
                 rs=(int)(price[c-1]+(price[c-1]*tax[c-1])/100);
                System.out.println(rs); 
                        break;
             case 5:
                rs=(int)(price[c-1]+(price[c-1]*tax[c-1])/100);
                
                System.out.println(rs); 
                break;
            default:
                break;
        }


    }
    
}
