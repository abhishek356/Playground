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
    }
    int rotate=in.nextInt();
    rot(arr,n,rotate);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
  public static void rot(int arr[],int n,int rotate)
  {
    if(n%2==1)
    {
      while(rotate>0)
      {
        int tempeven=arr[1];
        int tempodd=arr[n-1];
        for(int i=3;i<=n-2;i+=2)
        {
          arr[i-2]=arr[i];
        }
        arr[n-2]=tempeven;
        for(int i=n-1;i>=2;i-=2)
        {
          arr[i]=arr[i-2];
        }
        arr[0]=tempodd;
        rotate--;
        }
      }  
  else
  {
    while(rotate>0)
    {
      int tempodd=arr[n-2];
      for(int i=n-2;i>=2;i-=2)
      {
        arr[i]=arr[i-2];
      }arr[0]=tempodd;
      int tempeven=arr[1];
      for(int i=3;i<=n;i+=2)
      {
        arr[i-2]=arr[i];
      }
      arr[n-1]=tempeven;
      rotate--;
    }
  }
}
}
