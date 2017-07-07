# kuttypula13
import java.io.*;
import java.util.*;
public class Main
{
  
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b;
    System.out.println("Enter the range between two numbers");
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    System.out.println("The odd numbers of given range:");
    for(int i=a;i<=b;i++)
    {
      if(i%2==0)
      {
        System.out.println(i);
      }
    }
  }
}



