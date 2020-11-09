import java.util.Scanner;

class Solution5
{ 
	static void count(String line) 
	{ 
 
		char[] ch = line.toCharArray(); 
		for (int i = 0; i < ch.length; i++)
		{ 
			String s = ""; 
			while (i < ch.length && ch[i] != ' ')
			{
				s = s + ch[i]; 
				i++; 
		} 
			if ( s.length () > 0) 
				System.out.println(s + " : " + s.length());			 
		} 
}

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter any Sentence .....");
        String line =sc.nextLine();
        sc.close();
        
		count(line); 
	} 
 
}