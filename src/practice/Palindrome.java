package practice;

public class Palindrome {

	public static void main(String[] args) {
String s1="welcome to test yantra";
String rev=" ";
String[] s2=s1.split(" ");
 rev=s2[0];
 s2[0]=s2[s2.length-1];
 s2[s2.length-1]=rev;
 
 for(String s:s2)
 {
	 System.out.print(s  +" ");
 }
	}
	}
