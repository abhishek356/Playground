import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int t=n;
      int c=n;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=n-(row-1);col++)
        {
          System.out.print(t--);
        }
        System.out.println();
        c--;
        t=c;
      }
	}
}