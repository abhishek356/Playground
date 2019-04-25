import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    } int sum=0,k=0,j=0;
    int c[]=new int[n/3];
    for(int i=0;i<n;i++)
    { sum=sum+arr[i];j++;
      if(j==3)
      {
        c[k]=sum;k++;
        sum=0;
        j=0;
      }
    }int flag=0;
    for(int i=0;i<n/3;i++)
    {
      if(c[0]==c[i])
      {
        flag=1;
      }
      else
      {
        flag=0;
        break;
      }
    }
    if(flag == 1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}