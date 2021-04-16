package javainterview;

import java.util.HashSet;

public class HashSetArraygives7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,2,5,8,9,10};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
	for(int i=0;i<arr.length;i++)
	{
		set.add(arr[i]);
	}
	int arr1[]=new int[set.size()];
	int count=0;
	for(Integer value:set)
	{
		arr1[count]=value;
		count++;
	}
		for(int i=0;i<=arr1.length;i++)	
		{	
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]+arr1[j]==7)
				{
					System.out.println(arr[i]+ "   "+arr1[j]);
					
					
				}
						
			}
				
			
			
	}
			
	}
	}
	
