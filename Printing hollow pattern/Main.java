import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n=in.nextInt();
            for(int row=1;row<=n;row++)
            {
                System.out.print("*");
            }
            System.out.println();
            for(int row =2;row<n;row++)
            {
                for(int col=1;col<=n;col++)
                {
                    if(col==1||col==n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int row=1;row<=n;row++)
            {
                System.out.print("*");
            }
	}
}