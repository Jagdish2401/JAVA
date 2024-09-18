import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class pra5 
{
    public static void main(String[] args) throws Exception 
    {
        FileWriter fw=new FileWriter("first.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("jagdish");

        FileReader fr=new FileReader("first.txt");
        BufferedReader br=new BufferedReader(fr);
        int i;
        while ((i=br.read())!=1)
        {
            System.out.println((char)i);
        }
        
    }
    
}
