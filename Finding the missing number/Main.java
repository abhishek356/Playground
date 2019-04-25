import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int flag=1;
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      for(int i=1;i<=size;i++)
      {
        for(int j=0;j<size;j++)
        {
          if(i==arr[j])
          {
            flag=1;
            break;
          }
          else
          {
            flag=0;
          }
        }
        if(flag == 0)
        {
          System.out.println(i);
        }
      }
    }
}