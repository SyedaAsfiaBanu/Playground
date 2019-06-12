import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int n1= in.nextInt();
      int a=(n1%100);
      int b=(a/10);
      System.out.println(b);
	}
}