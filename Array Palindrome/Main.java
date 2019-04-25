import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int left = 0,right = size-1;
      boolean is_palindrome = true;
      while(left<right)
      {
        if(arr[left]==arr[right])
        {
         is_palindrome = true;
        }
        else
        {
          is_palindrome = false;
          break;
        }
        left++;
        right--;
      }
      if(is_palindrome == true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      }
}