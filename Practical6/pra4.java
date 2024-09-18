import java.io.*;

public class pra4 
{  
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("first.txt");
        FileOutputStream fso=new FileOutputStream("two.txt");
        int x;
        while ((x=fis.read())!=-1)
        {
        fso.write(x);  
        }
        fis.close();
        fso.close();
        System.out.println("copid successaly");
    }
    
}
