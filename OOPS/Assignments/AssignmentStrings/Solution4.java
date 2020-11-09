import java.util.Scanner;
public class Solution4
{
	public static void main(String[] args) {
		System.out.println("Enter the your Sentence...");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
	//	String s1="";
		char ch[] = s.toCharArray();
		int j, i,c = 0;
		int l = ch.length; 
		for (i = 0; i < l; i++)
		{
			for (j = 0; j < l; j++)
			{
				if (ch[i] == ch[j])
					c++;
			}
			if (c == 1)
			{
				System.out.println("Single character in the sentence is  ::");
				System.out.println();
				System.out.println(ch[i]);
			break;
			}
				c = 0;			
		  }
		
	}
}
