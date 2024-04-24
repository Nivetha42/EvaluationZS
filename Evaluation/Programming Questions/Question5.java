import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ans=new int[n][n];
		int top=0;
		int bottom=n-1;
		int right=n-1;
		int left=0;
		int start=1;
		
		while(n>=1)
		{
			for(int i=left;i<=right;i++)
			{
				ans[left][i]=start;
				
			}
			left++;
			for(int i=right;i>top;i--)
			{
				ans[i][right]=start;
				
			}
			right--;
			
			for(int i=bottom;i>=top;i--)
			{
				ans[bottom][i]=start;
			}
			bottom--;
			for(int i=top;i<=right;i++)
			{
				ans[i][top]=start;
			}
			top++;
			
			if(start==1)
			{
				start=0;
			}else
			{
				start=1;
			}
			n=n-2;
		}
		System.out.println("Output : ");
		display(ans);
		
	}

	private static void display(int[][] ans) {
		for(int[] a:ans)
		{
			for(int n:a)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}
	

}
