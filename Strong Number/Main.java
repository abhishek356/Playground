import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int copy = n,sum = 0;
      while(n!=0)
      {
        int remainder = n%10,factorial=1;
        for(int i=1;i<=remainder;i++)
        {
          factorial=factorial*i;
        }
        sum = sum + factorial;
        n=n/10;
      }
      if(sum==copy)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}