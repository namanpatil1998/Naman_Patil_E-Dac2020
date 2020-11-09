import java.util.Scanner;
public class Solution8
{
	
   public static String reverseString(String str)
   {
    
      char ch[] = str.toCharArray();
      int n = ch.length;
      char result[] = new char[n];
      for(int i = 0; i<ch.length; i++) {
         result[n-1] = ch[i];
         n = n - 1;
      }
      return new String(result);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.nextLine();
      String result = Solution8.reverseString(str);
      System.out.println(result);
      sc.close();
   }
}