import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent=in.nextInt();
    System.out.println(Calculate(base,exponent));
    
  }
  public static int Calculate(int base,int exponent)
  {
    int product=1;
    for(int i=1;i<=exponent;i++)
    {
      product=product*base;
    }
    return product;
  }
}