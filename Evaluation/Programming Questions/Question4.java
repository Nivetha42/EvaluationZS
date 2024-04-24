import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*int[] arr=new int[]{-2,7,10,-4};*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in the array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
				
		int res=0;
		int sum=0;
		int startIndex=-1;
		int endIndex=-1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				if(res<sum)
				{
					res=sum;
					startIndex=i-count;
					endIndex=i-1;
					count=0;
				}
				sum=0;
			}
			else
			{
				sum=sum+arr[i];
				count++;
				
			}
		}
		if(arr[arr.length-1]>0)
		{
			if(res<sum)
			{
				res=sum;
				startIndex=arr.length-count;
				endIndex=arr.length-1;
			}
		}
		
		
		System.out.println("Sum : "+res);
		if(startIndex==-1 || endIndex==-1)
		{
			System.out.println("No Such Subarray");
		}
		else {
			System.out.println("Elements are : ");
		for(int i=startIndex;i<=endIndex;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
	}

}
