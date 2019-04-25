import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int value = in.nextInt();
      pairs(arr,n,value);
    }
  public static void pairs(int arr[],int n,int value)
  {  int sum=0,j;
    for(int i=0;i<n;i++)
    {sum=0;
      for(j=i+1;j<n;j++)
      {
        sum=arr[i]+arr[j];
      
      if(sum==value)
      {
        System.out.println(arr[i]+", "+arr[j]);
      }
      }
    }
  }
}