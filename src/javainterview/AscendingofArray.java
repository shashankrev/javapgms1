package javainterview;

public class AscendingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
			
			for(int b:a)
			{
		System.out.println(b);
		
		}
		

	}

	}

