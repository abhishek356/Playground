import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      int f=0,max =0;
      for(int i=0;i<size;i++)
      { 
        if(arr[i]==1)
        {
          f++;
        }
        else
        {
          if(max<f)
          {
            max=f;
            f=0;
          }
        }
        
      }
      System.out.println(max);
    }
}
    
