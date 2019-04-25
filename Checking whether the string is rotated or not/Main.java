import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String temp = str1+str1;
      String str2 = in.nextLine();
      if(temp.contains(str2)==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}