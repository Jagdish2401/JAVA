import java.io.*;

public class pra3 {
    public static void main(String[] args) {
        try {
            File f = new File("first.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            boolean occur = false;
            String s = "Jay Dwarkadhish";
            String i;
            while ((i = br.readLine()) != null) {
                String arr[] = i.split(" ");
                for (String word : arr) 
                {
                    if(word.equals(s)) 
                    {
                        occur = true;
                        break;
                    }
                }
                if (occur) {
                    break;
                }
            }
            if (occur) {
                System.out.println("The word is present in the file.");
            } else {
                System.out.println("The word is not present in the file.");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


