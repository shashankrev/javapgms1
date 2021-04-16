package javainterview;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] a= {1,2,3,5,8,9};
	int first=0;
	int search=1;
	int last=a.length-1;
	int middle=(first+last)/2;
	
	while(first<=last)
	{
		if(a[middle]<search)
		{
			first=middle+1;
			
		}
			else if(a[middle]==search)
			{
			System.out.println("found @" + middle);	
			
			}
			else
			{
				last=middle-1;
				break;
			}
		
		middle=(first+last)/2;
		}
	
	if(first>last)
	{
		System.out.println("not found");
	}
			
	}
}
