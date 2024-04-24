import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of digits for Number1");
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		System.out.println("Enter the Number1");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter no. of digits for Number2 : ");
		int n2=sc.nextInt();
		int[] a2=new int[n2];
		System.out.println("Enter the Number2 : ");
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
	
		/*int[] a1=new int[] {9,2,8,1,3,5,6,7,3,1,1,6};
		int[] a2=new int[] {7,8,4,6,2,1,9,9,7};*/
		ArrayList<Integer> arr=new ArrayList();
		int carry=0;
		int i=a1.length-1;
		int j=a2.length-1;
		while(i>=0 || j>=0)
		{
			int f=(i>=0)?a1[i]:0;
			int s=(j>=0)?a2[j]:0;
			int sum=f+s+carry;
			if(sum>9)
			{
				carry=1;
			}
			else
			{
				carry=0;
			}
			arr.add(0,sum%10);
			i--;
			j--;
		}
		int[] res=new int[arr.size()];
		for(int k=0;k<arr.size();k++)
		{
			res[k]=arr.get(k);
		}
		System.out.println("Output : ");
		for(int a:res)
		{
			System.out.print(a+" ");
		}
	}

}
