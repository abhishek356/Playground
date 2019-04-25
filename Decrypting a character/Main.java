import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      int i=1;
      int f=0;
      if(ch>=97&&ch<=122)
        {
            f=1;
        }
        else
        {
            f=0;
            ch = (char)(ch+32);
        }
        while(i==1)
        {
        if(ch-key<97)
        {
            int j=ch-97;
            key = key - j;
            ch = (char)('z'-key+1);
          break;
        }
        else
        {
            ch = (char)(ch - key);
            i=0;
        }
        }
        if(f==1)
        {
            System.out.print(ch);
        }
        else
        {
            ch=(char)(ch-32);
            System.out.print(ch);
        }
    }
}