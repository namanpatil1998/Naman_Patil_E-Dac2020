import java.util.Scanner;

public class Solution6 {
	public static void main(String args[]) 
{ 
		System.out.println("Enter your Sentence....");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		if(s.length()%3==0)
		{ 
			int k=s.length()/3;
			String s1=s.substring(0,k);
			for(int i=0;i<s.length();i=i+k)
			{
				if(s1.equalsIgnoreCase(s.substring(i, i+k)))
				{
					c++;
				}
			}
			System.out.println("True :: three times is repeating character present in string ");
		}
		else
		System.out.println("False");
        sc.close();
}
}
