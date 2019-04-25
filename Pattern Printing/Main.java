import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int start_number = in.nextInt();
      int follow_up = in.nextInt();
      int wedge = follow_up;
      for(int i =1 ;i<=start_number;i++)
      {
        for(int j = 1;j<i;j++)
        {
          System.out.print(wedge--);
        }
        for(int k=0;k<follow_up;k++)
        {
          System.out.print(follow_up);
        }follow_up--;
        System.out.println();
        wedge = start_number;
      }
    }
}