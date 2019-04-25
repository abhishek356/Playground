import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int t=0;
      for(int row =1;row<=n;row++)
      {
        for(int space=1;space<=n-row;space++)
        {
          System.out.print(" ");
        }
        for(int star=1;star<=row+t;star++)
        {
          	System.out.print("*");
        }t=t+1;
        System.out.println();
      }
	}
}