package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write{
    public static void main(String [ ] args)
    { 
        try
    {
        FileWriter writing = new FileWriter("myfile.txt");
        writing.write("hi there! my name is zainab khan.");
        writing.close();
        System.out.println("the data has be written on the file");
        
    }
        catch(Exception e)
                {
                    System.out.println("error!!!1");
                    e.getStackTrace();
                    
                }
        
      
    }}
