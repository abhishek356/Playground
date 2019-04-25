import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      str = str.toLowerCase();
      String copy = str;
      StringBuilder sb = new StringBuilder(str);
      int count = 0 ;
      for(int i=0;i<str.length();i++)
      {
        for(int j=0;j<str.length();j++)
        {
           if(str.charAt(i)==str.charAt(j))
           {
             count++;
             if(count>1)
             {
               sb.setCharAt(j,'$');
             }
           }
        } count=0;
      }
      frequency(sb,copy);
    }
  public static void frequency(StringBuilder ss, String str)
  {
    for(int i=0;i<ss.length();i++)
    {
      char ch = ss.charAt(i);
      if(ch>='a'&&ch<='z')
      { int f=0;
        for(int j=0;j<str.length();j++)
        {
          if(ch == str.charAt(j))
          {
            f++;
          }
        }
       System.out.print((char)(ch));
         System.out.print(f+" ");
      }
    }
  }
}