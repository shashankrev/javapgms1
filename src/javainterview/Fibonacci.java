package javainterview;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1,newnum;
        for(int i=0;i<=3;i++)
        {
        	newnum=n1+n2;
        	n1=n2;
        	n2=newnum;
        	   System.out.println(newnum);
        }
     
	}

}
