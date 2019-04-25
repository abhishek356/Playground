import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
    int max=-10000;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);
    }
}