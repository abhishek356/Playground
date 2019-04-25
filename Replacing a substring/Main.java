import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
       Scanner in = new Scanner(System.in);
      String string = in.nextLine();
      String sub = in.nextLine();
      String rep = in.nextLine();
      System.out.println(string.replace(sub,rep));
      
    }
}