import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val=n;
        for(int cur_row=1;cur_row<=n;cur_row++)
        {
         
          for(int cur_col=val;cur_col>=1;cur_col--)
          {
            System.out.print(cur_col);
          }
          val--;
          System.out.println();
        }
	}
}