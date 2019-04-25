import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       String str1 = in.nextLine();
      String str2 = in.nextLine();
      int no_of_parts = in.nextInt();
      str1 = str2;
      int f = 0;
        for(int i = 0;i<str1.length();i++)
        {
          char c = str1.charAt(i);
         
          if(c == ' ')
          {f++;
            System.out.println();
          }
          else
          {
            System.out.print(c);
          }
         }
        if(f==(no_of_parts-1))
          {
            
          }
      
    }
}