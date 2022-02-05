package FileHandling;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Read
{
    public static void main(String [] args)
    { try
    {
        File myobj = new File("myfile.txt");
        Scanner reader = new Scanner(myobj);
        while(reader.hasNextLine())
        {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close(); 
    }
    catch(Exception e)
    {
        System.out.println("error!!!");
     e.getStackTrace();   
    }
}

}