import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1,n2,n3;
      n1 = in.nextInt();
      n2 = in.nextInt();
      n3 = in.nextInt();
      System.out.println(Gcd(Gcd(n1,n2),n3));
    }                      
  public static int Gcd(int n1,int n2)
  {
    int a=1;
    if(n1>n2)
      a=n2;
    else
      a=n1;
    int i=a;
    while(i>=1)
    {
      if(n1%i==0&&n2%i==0)
      {
        a=i;
      break;}
      i--;
    }
    return a;
  }
     }