package javainterview;

public class MakeallUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="indiaindia";
		String res="";
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='i')
			{
			char ch=(char)(s.charAt(j)-32);
			res=res+ch;
			
			}
			else
			{
				res=res+s.charAt(j);
			}
		}
		System.out.println(res);

	}

}
