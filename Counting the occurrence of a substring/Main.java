import java.util.Scanner;
class Main{
  public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
    String str1,str2;
    str1 = in.nextLine();
    str2 = in.nextLine();
    int count = 0;
    for(int i = 0;i<str1.length()-str2.length()+1;i++)
    {boolean is_matching = false;
      for(int j = 0;j<str2.length();j++)
      {
        if(str1.charAt(i+j)==str2.charAt(j))
        {
          is_matching = true;
        }
      }
     if(is_matching==true)
     {
       count++;
     }
    }
    System.out.println(count);
      } 
}