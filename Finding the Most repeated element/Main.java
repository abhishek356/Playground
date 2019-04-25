import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
    {
      arr[i]=in.nextInt();
    }
    int index=0,element=0,f=0,max=0;
    for(int i=0;i<size;i++)
    {
      for(int j=0;j<size;j++)
      {
        if(arr[i]==arr[j]&&i<j)
        {
          f++;
        }
      }
      if(max<f)
      {
        max = f;
        f=0;
        element = arr[i];
        index = i;
      }
      if(max == f && i<=index)
      {
        max = f;
        element = arr[i];
        f=0;
        index = i;
      }
    }
    System.out.println(element);
}
}