import java.util.*;

public class Solution3 {
	public static void main(String args[])
	{
		System.out.println("Enter any Sentence..");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String s1="";
		char a[]= s.toCharArray();
		int size = s.length();
		for(int i=0;i<size-1;i++)
		{
		if(a[i]==a[i+1])
		{
			a[i]=' ';
		
		}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]!=' ')
			{
				s1=s1+a[i];
			}
		}
		System.out.println("Your expwxted output is  ::");
		System.out.println();
		System.out.println(s1);
		}

}
