package javainterview;

public class ConvertstringandADDparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12345";
		int n=Integer.parseInt(s);
		int sum=0;
		 
		while(n!=0)
		{
		int i=n%10;
             sum=sum+i;
             n=n/10;
            }
		 System.out.println(sum);

	}

}
