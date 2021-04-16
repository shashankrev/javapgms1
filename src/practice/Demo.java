package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		String s="india";
		char[] s1=s.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s1.length;i++)
		{
		hs.add(s1[i]);
		}
		for(Character ch:hs)
		{
			int count=0;
		for(int i=0;i<s1.length;i++)
		{
		
		for(Character s2:hs)
		{
		if(s2==s1[i])
		{
		count++;
		
		
		}
		
		System.out.println(s2   +   " "       +count);

		}
		}
		}
	
}
	}