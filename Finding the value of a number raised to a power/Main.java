import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int output=1;
      for(int i = 1;i<=exponent;i++)
      {
        output = base*output;
      }
      System.out.println(output);
    }
}