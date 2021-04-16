package javainterview;

public class Basedonkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,60,70,90};
		int key=5;
		
		for(int i=0;i<key;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;

			}}
		for(int a:arr) {
			System.out.println(a);
			
		}

}
}