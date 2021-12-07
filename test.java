import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      int i=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      String str = scan.nextLine();
      
      while(true)
      {
         try
         {
            char ch = str.charAt(i);
            i++;
         }
         catch(Exception e)
         {
            System.out.println("\nLength of String = " +i);
            break;
         }
      }
   }
}
