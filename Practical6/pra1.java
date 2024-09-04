
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pra1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int no = scan.nextInt(); //no. of files
        String[] names = new String[no];
        File[] files = new File[no];

        for(int i = 0; i < no; i++)
        {
            names[i] = scan.next();
        }

        for(int i = 0; i < no; i++)
        {
            try
            {
                File file = new File(names[i]);
                files[i] = file;
                int count = 0;
    
                if(!files[i].createNewFile())
                {
                    Scanner sc = new Scanner(file);
                    while(sc.hasNextLine())
                    {
                        sc.nextLine();
                        count++;
                    }
                    sc.close();

                    System.out.println(file.getName() + " has " + count + " lines");
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        scan.close();
    }
}


