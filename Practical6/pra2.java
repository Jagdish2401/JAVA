import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class pra2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of files: ");
        int no = scan.nextInt(); // number of files
        String[] names = new String[no];

        System.out.println("Enter the file names:");
        for (int i = 0; i < no; i++) {
            names[i] = scan.next();
        }

        System.out.print("Enter the character to count: ");
        char targetChar = scan.next().charAt(0);

        for (int i = 0; i < no; i++) {
            try {
                File file = new File(names[i]);
                int charCount = 0;

                if (file.exists()) {
                    FileReader reader = new FileReader(file);
                    int c;
                    while ((c = reader.read()) != -1) {
                        if (c == targetChar) {
                            charCount++;
                        }
                    }
                    reader.close();
                    
                    System.out.println("The character '" + targetChar + "' appears " + charCount + " times in " + file.getName());
                } else {
                    System.out.println(file.getName() + " does not exist.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
        scan.close();
    }
}
