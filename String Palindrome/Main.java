import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      boolean is_matching  = true;
      int j = str.length()-1;
      for(int i= 0 ;i<str.length()/2;i++)
      {
        if(str.charAt(i)==str.charAt(j))
        {
          is_matching = true;
        }
        else
        {
          is_matching =false;
          break;
        }j--;
      }
      if(is_matching == true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}