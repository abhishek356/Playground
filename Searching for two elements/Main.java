import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int n1,n2;
      n1 = in.nextInt();
      n2 = in.nextInt();
      int i =2,f=-1,g=n1;
      while(i>0)
      {
        for(int j =0;j<n;j++)
        {
          if(g==arr[j])
          {
            f=j;
            break;
          }
        }
        if(f!=-1)
        {
          System.out.println(f);
        }
        else
        {
          System.out.println(f);
        }
        g=n2;
        i--;
        f=-1;
      }
    }
}