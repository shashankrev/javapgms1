package javainterview;

public class Sumofminimum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,8,33,9};
		int sum=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int s:arr)
		{
			System.out.println(s);
				}
			
	for(int i=0;i<=2;i++)
	{
	 sum+=arr[i];
	}
	System.out.println("sum is"+   sum);	
		
		
	}
		}

	
