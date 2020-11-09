
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		System.out.println("Enter your Sentence....");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), s1 = "", s2 = "";
		int i;
		s = s + ' ';
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				switch (s2) {
				case "zero":s2="one";
				break;
				case "one":
					s2 = "two";
					break;
				case "two":
					s2 = "three";
					break;
				case "three":
					s2 = "four";
					break;
				case "four":
					s2 = "five";
					break;
				case "five":
					s2 = "six";
					break;
				case "six":
					s2 = "seven";
					break;
				case "seven":
					s2 = "eight";
					break;
				case "eight":
					s2 = "nine";
					break;
				case "nine":
					s2 = "ten";
					break;
				}

				s1 = s1.concat(s2);
				s1 = s1 + ' ';
				s2 = "";
			} else
				s2 = s2 + s.charAt(i);
		}
		System.out.println("Your expected output is    ::");
		System.out.println();
		System.out.println(s1);
		sc.close();

	}
}
