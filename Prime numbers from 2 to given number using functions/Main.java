import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
      int n= in.nextInt();
      System.out.println(2);
      prime(n);
	}
  public static void prime(int n)
  {
    for(int i=3;i<=n;i++)
    {int flag=1;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          flag=0;
          break;
        }
      }
     if(flag==1)
     {
       System.out.println(i);
     }
    }
  }
}