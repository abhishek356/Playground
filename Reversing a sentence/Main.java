import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String s = "";
      String word="";
      char ch;
      str = str+" ";
      for(int i = 0;i<str.length();i++)
      { ch =str.charAt(i);
       if(str.charAt(i) == ' ')
       {
         s = word+" "+s;
         word= "";
       }
       else{
       word = word+ch;
       }
      }
      System.out.println(s.trim());
    }
}