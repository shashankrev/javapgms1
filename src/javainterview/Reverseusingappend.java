package javainterview;

public class Reverseusingappend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
		}
		System.out.println(rev);
	}

}
