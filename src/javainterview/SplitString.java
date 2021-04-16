package javainterview;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="india";
		String rev="";
		String[] s1=s.split("");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s1[i]+"";
			
		}
System.out.println(rev);
	}

}
