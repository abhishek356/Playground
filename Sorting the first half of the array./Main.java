import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    int size = n/2;
    for(int i =0;i<size-1;i++)
    {
      for(int j=0;j<=size-2-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}