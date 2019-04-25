import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String s = in.nextLine();
    StringBuilder sb1 = new StringBuilder(str);
    StringBuilder sb2 = new StringBuilder(s);
    
    for(int index1 = 0;index1< sb2.length();index1++)
    {
      for(int index2 = 0; index2<sb1.length();index2++)
      {
        if(sb2.charAt(index1)==sb1.charAt(index2)&&sb1.charAt(index2)!=' ')
        {
          sb1.setCharAt(index2,' ');
        }
      }
    }
    String d = " ";
    for(int i=0;i<sb1.length();i++)
    {
      if(sb1.charAt(i)!=' ')
      {
        d = d+sb1.charAt(i);
      }
    }
    System.out.println(d.trim());
  }
}