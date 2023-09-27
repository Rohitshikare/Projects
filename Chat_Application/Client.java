import java.net.*;
import java.io.*;

public class Client
{
  public static void main(String A[]) throws Exception
  {
     System.out.println("Client application is Running");
     
     Socket s = new Socket("localhost",2100);
     System.out.println("Client is waiting for the server to accept the Request"); 
     
     PrintStream ps = new PrintStream(s.getOutputStream());
     
     BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
     BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
     
     String str1,str2;
     
     while( !(str1 = br2.readLine()).equals("End"))
       {
          System.out.println("Enter Message for Server : ");
          ps.println(str1);
          
          
          str2 = br1.readLine();
          System.out.println("Server Says : "+str2);
          
          
          
       }
     
  }
}  

