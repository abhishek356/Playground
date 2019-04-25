import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1,n2,n3;
      n1 = in.nextInt();
      n2 = in.nextInt();
      n3 = in.nextInt();
      System.out.println(Greatest_of_the_three(n1,n2,n3));
	}
  public static int Greatest_of_the_three(int n1,int n2,int n3)
  {
    if(n1>n2&&n1>n3)
      return n1;
    else if(n2>n1&&n2>n3)
      return n2;
    else
      return n3;
  }
}