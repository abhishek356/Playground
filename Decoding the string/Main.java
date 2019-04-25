import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int key = in.nextInt();
    for(int i = 0 ;i<str.length();i++)
    {
      char ch = sb.charAt(i);
      if(ch!=' ')
      {
        if(ch<='z'&&ch>='a')
        {
        if((ch-key)<97)
        {
          int k = ('a'-(ch-key+1));
          char c = (char)('z'-k);
          sb.setCharAt(i,c);
        }
          else
          {
            char c = (char)(ch - key);
            sb.setCharAt(i,c);
          }
      }
        else
        {
          if((ch-key)<65)
          {
            int k = ('A'-(ch - key));
            char c = (char)('Z'-k);
            sb.setCharAt(i,c);
          }
          else
          {
            char c = (char)(ch-key);
            sb.setCharAt(i,c);
          }
        }
      }
    }
    System.out.println(sb);
  }
}