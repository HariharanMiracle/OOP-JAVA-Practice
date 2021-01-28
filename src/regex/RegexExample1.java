package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String args[]) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		boolean bb = Pattern.compile(".s").matcher("as").matches();
		
		boolean bbb = Pattern.matches(".s", "as");
		
		System.out.println(b + " === " + bb + " === " + bbb);
		
		
		// ============================================================
		System.out.println("============================================================");
		
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		
		
		// ============================================================
		System.out.println("============================================================");
		
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		System.out.println(Pattern.matches("[amn]", "m")); //true
		System.out.println(Pattern.matches("[amn]", "n")); //true
		System.out.println(Pattern.matches("[^abc]", "x")); //true
		System.out.println(Pattern.matches("[a-cA-C]", "a")); //true
		System.out.println(Pattern.matches("[a-z&&[def]]", "d")); //true
		System.out.println(Pattern.matches("[a-z&&[^ab]]", "m")); //true
		System.out.println(Pattern.matches("X?", "")); //true
		System.out.println(Pattern.matches("X?", "X")); //true
		System.out.println(Pattern.matches("X+", "XXXXX")); //true
		System.out.println(Pattern.matches("X*", "")); //true
		System.out.println(Pattern.matches("X*", "XXX")); //true
		System.out.println(Pattern.matches("a{3}", "aaa")); //true
		System.out.println(Pattern.matches("[a-z]{2,}", "hari")); //true
		
		// First letter capital rest is simple and minimum 8 character
		System.out.println("First letter capital rest is simple and minimum 8 character");
		System.out.println(Pattern.matches("[A-Z][a-z]{6,}", "Hariharan")); //true
		System.out.println(Pattern.matches("[A-Z][a-z]{6,}", "hariharan")); //false
		System.out.println(Pattern.matches("[A-Z][a-z]{6,}", "HariHaran")); //false
		System.out.println(Pattern.matches("[A-Z][a-z]{6,}", "HariharaN")); //false
		System.out.println(Pattern.matches("[A-Z][a-z0-9]{6,}", "Hariharan1")); //true
		
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		  
		System.out.println("metacharacters D....");//\\D means non-digit  
		  
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
		
		
		
	}
	
}
