package javainterview;

public class Reversechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		char ch[]=s.toCharArray();
		String rev="";
	
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
			
		}
		System.out.println(rev);
		
	}

}
