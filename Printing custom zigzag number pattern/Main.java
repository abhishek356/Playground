import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=1,j=2,k=3,l=2;
        for(int row=1;row<=n;row++)
        {
            if(row%2==1)
            {
                for(int col =1;col<n;col++)
                {
                    System.out.print(i);
                }
                System.out.print(j);
                System.out.println();
                i=i+2;j=j+2;
            }
            else
            {
                System.out.print(k);
                for(int col=1;col<n;col++)
                {
                    System.out.print(l);
                }
                System.out.println();
                k=k+2;l=l+2;
            }
        }
	}
}