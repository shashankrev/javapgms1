package practice;

import java.util.HashSet;

public class arraysorting {

	public static void main(String[] args) {
        
	int[] a= {1,5,2,6,8};
	
	HashSet<Integer> set=new HashSet<Integer>();
	
	for(int i=0;i<=a.length-1;i++)
	{
		set.add(a[i]);
		
	}
	int[] a1=new int[set.size()];
	int count=0;
	for(int b:set)
	{
		a1[count]=b;
		count++;
	}
	
	for(int i=0;i<a1.length;i++)
	{
		for(int j=i+1;j<a1.length;j++)
		{
		if(a1[i]+a1[j]==7)
		{
			System.out.println(a1[i]+ "    "   +       a1[j]     );
		}
		}
		
	}
	}
	
	
	}
