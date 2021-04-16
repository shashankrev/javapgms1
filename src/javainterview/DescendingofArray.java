package javainterview;

public class DescendingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {5,10,15,20};
		
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
					
					}
				for(int z:b)
				{
					System.out.println(z);
				}
			

	}

}
