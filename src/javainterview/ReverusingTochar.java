package javainterview;

public class ReverusingTochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="great";
             char ch[]=s.toCharArray();
           String rev="";
           for(int i=0;i<ch.length;i++)
           {
        	   rev=ch[i]+rev;
        	   
           }
           System.out.println(rev);
           
	}
	
	

}
