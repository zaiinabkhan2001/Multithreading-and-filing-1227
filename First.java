package FileHandling;

import java.io.File;
import java.io.IOException;


public class First
{

    public static void main(String [] args)
    {
        try{
       
            File myobj = new File("myfile.txt");
        
            if(myobj.createNewFile())
            {
                System.out.println("file is created.");
                
            }
            else
            {
                System.out.println("file is not created");
            }
        } catch (Exception e) {
            System.out.println("error");
            e.getStackTrace();
        }
            
            
        
    }

}