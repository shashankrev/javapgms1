package javainterview;

import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="india";
		 char[] ch=s.toCharArray();
		 LinkedHashSet<Character> s1=new LinkedHashSet<Character>();
		 
		 for(char d:ch)
			 
		 {
			 s1.add(d);
		 }
	 

		 StringBuilder sb=new StringBuilder();
		 for(char character:s1)
		 {
			 sb.append(character);
			 
		 }
		 System.out.println(sb.toString());
	}
	}

		 
		 