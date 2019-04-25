import java.util.Scanner;
class Main{
    public static void main(String args[]){
      
      Scanner in = new Scanner(System.in);
      int arr[] = new int[26];
      String str = in.nextLine();
      str = str.toLowerCase();
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<str.length();i++)
      {    if(str.charAt(i)!=' ')
      {
        int unicode = str.charAt(i)-'a';
        arr[unicode]++;
      }
      }
      for(int j=0;j<26;j++)
      {
        if(arr[j]==0)
        {
          char c = (char)('a'+j);
          System.out.print(c+" ");
        }
      }
    }
}