import java.util.Scanner;
class Solution7{ 
	
	static void caseChange(StringBuffer string) 
	{ 
		int n = string.length(); 
		for (int i=0; i<n; i++) 
		{ 
			Character c = string.charAt(i); 
			if (Character.isLowerCase(c)) 
				string.replace(i, i+1, Character.toUpperCase(c)+""); 
			else
				string.replace(i, i+1, Character.toLowerCase(c)+""); 
			
		} 
	} 
	
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that you want reverse ");
		String s=sc.nextLine();
		StringBuffer string = new StringBuffer(s); 
		caseChange(string); 
		System.out.println(string); 
		sc.close();
		} 
} 
