package FileHandling;
 import java.io.File;
import java.io.IOException;

public class Info
{
    public static void main (String [ ] args)
    {
        File myobj = new File("myfile.txt");
        if (myobj.exists())
        {
            System.out.println("file name:" + myobj.getName());
            System.out.println("file path" + myobj.getAbsolutePath());
            System.out.println("file writeable:" + myobj.canWrite());
            System.out.println("file readable:" + myobj.canRead());
            System.out.println("file siZe in bytes:" + myobj.length());
            
        }
        else
        {
            System.out.println("file not exists:");
        }
    }
}