import java.util.*; 

class Solution9 
{ 
           	static int max=26;
			static void same(String string1,int l1,String string2,int l2) 
		{   
			int present[] = new int[max]; 
			for (int i = 0; i < max; i++) 
			{ 
				present[i] = 0; 
			} 
 
			for (int i = 0; i < l1; i++) 
			{ 
				present[string1.charAt(i) - 'a'] = 1; 
			} 
			for (int i = 0; i < l2; i++) 
			{ 
				if (present[string2.charAt(i) - 'a'] == 1
					|| present[string2.charAt(i) - 'a'] == -1) 
				{ 
					present[string2.charAt(i) - 'a'] = -1; 
				} 
				else
				{ 
					present[string2.charAt(i) - 'a'] = 2; 
				} 
			} 
			for (int i = 0; i < max; i++) 
			{ 
				if (present[i] == -1 || present[i] == -1) 
				{ 
					System.out.print((char) (i + 'a') + " "); 
				} 
			} 
		} 




public static void main(String args[]) 
{ 
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String1 value: ");
      String string1 = sc.nextLine();
      System.out.println("Enter a String2 value: ");
      String string2 = sc.nextLine();
      int l1 = string1.length();
      int l2 = string2.length(); 
	  same(string1, l1, string2, l2); 
	  sc.close();
} 
} 
