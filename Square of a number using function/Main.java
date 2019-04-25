import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s=square(n);
      System.out.println(s);
	} 
  public static int square(int n)
  {
    return n*n;
  }
}