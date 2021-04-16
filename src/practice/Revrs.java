package practice;



public class Revrs {

	public static void main(String[] args) {
String s="india is";
String rev=" ";
String[] s1=s.split(" ");
int b=s1.length;

for(int i=b-1;i>=0;i--)
{
	rev=rev+s1[i]+" ";
}
System.out.println(rev);

if(rev.equals(s))
{
System.out.println(s+ "is palindrome");

}

}	
}

