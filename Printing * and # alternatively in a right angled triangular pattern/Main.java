import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=1;
        n--;
        int i=1;
        System.out.print("*");
        System.out.println();
        while(c<=n)
        {
            while(i<=2)
            {if((c-1)==n)
            {
                break;
            }
                    for(int j=0;j<=c;j++)
                    {
                        if(j%2==0)
                        {
                            System.out.print("#");
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                    i++;c++;
                    System.out.println();
            }
            while(i<=4)
            {if((c-1)==n)
            {
                break;
            }

                for(int j=0;j<=c;j++)
                {
                    if(j%2==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("#");
                    }


                }
                c++;i++;
                System.out.println();
            }
            i=1;
        }
    }
}