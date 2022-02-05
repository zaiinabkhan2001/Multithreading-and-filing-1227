
package multithreading;

import java.lang.Thread;

public class Multi extends Thread
{
    public void run()
    {
       
        System.out.println("hi my name is zainab khan");
        for(int i = 0; i<5; i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println("error");
                e.getStackTrace();
                        
            }
        }
    }
    public static void main(String [] args)
    {
        Multi thing1 = new Multi();
        Multi thing2 = new Multi();
     
        System.out.println("name:"+ Thread.currentThread().getName());
        System.out.println("name of thread" +thing1.getName());
        System.out.println("name of thread" +thing2.getName());
        System.out.println("Id:" +thing1.getId());
        thing1.setName("java ");
        System.out.println("name of thread after changing" +thing1.getName());
           
       thing1.start();
       try{
       thing1.join();}
       catch(Exception e)
       {
           System.out.println("error!!");
           e.getStackTrace();
           
       }

         thing2.start();
       
       
    }
}
