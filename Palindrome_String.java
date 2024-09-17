
public class Main
{
	public static void main(String[] args) {
	    
	   String a="paap";

	 
	String ans="";
	
	for(int i=a.length()-1;i>=0;i--)
	{
	    ans=ans+a.charAt(i);
	}
	
	if(ans.equals(a))
	{
	System.out.println("yes palindrome"+"  "+ans);
	}
	else {
	    System.out.println("not a palindrome");
	}
	}
}