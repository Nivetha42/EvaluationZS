import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("Enter no of elements in the array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int[] arr=new int[] {4,1,2,3,1,2,5,2};
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			h.put(arr[i], h.getOrDefault(arr[i],0)+1);
		}
		
		int[] nums=new int[h.size()];
		int[] freq=new int[h.size()];
		String ans="";
		int j=0;
		for(int i:h.keySet())
		{
			nums[j]=i;
			freq[j]=h.get(i);
			j++;
		}
		for(int i=0;i<freq.length;i++)
		{
			for(int k=i+1;k<freq.length;k++)
			{
				if(freq[i]<freq[k])
				{
					
					swap(freq,i,k);
					swap(nums,i,k);
				}
			}
		}
		int res=0;
		for(int i=0;i<nums.length;i++)
		{
			while(freq[i]!=0)
			{
				arr[res]=nums[i];
				freq[i]--;
				res++;
			}
		}
		for(int a:arr)
		{
		System.out.print(a+" ");
		}
	}

	private static void swap(int[] arr, int i, int k) {
		int temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
		
	}

}
