package javainterview;

public class Sumofmax3elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,200,500,300,400};
		int sum=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
		 for(int j=i+1;j<arr.length;j++)
		 {
			 
			 if(arr[i]<arr[j])
				 
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
				 
		 }
		}
				 for(int a:arr)
				 {
					 System.out.println(a);
				 }
					for(int i=0;i<3;i++) 
					{
	          
						sum=sum+arr[i];
					}
					System.out.println("sum is "+sum);
				 
			 }
				 
		}
	


