package com.dante.learn.core;

//import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main (String args[]) {
		String find1 = "term is 120 months";
		String regex1 = "[0-9]{1,3}";
		System.out.println("1 Original string->:"+find1+":  new string->"+findScript(find1, regex1));
		
		String find2 = "perentage of loan is: 4.715 % starting january 1, 2017";
		String regex2 = "[0-9]{1,2}\\.[0-9]{1,3}";
		System.out.println("2 Original string->:"+find2+":  new string->"+findScript(find2, regex2));
		
		String find3 = "parse this baby to Hamilton Constitution Writers";
		String regex3 = ".*to ";
		System.out.println("3 Original string->:"+find3+":  new string->"+removeScript(find3, regex3));
		

		String find4 = "We do not want parentheses (like this stuff 4.125) in our strings";
		String regex4 = " \\([a-zA-Z0-9. ]*\\)";
		System.out.println("4 Original string->:"+find4+":  new string->"+removeScript(find4, regex4));

		
	}
	
	private static String removeScript(String content, String sregex) {
		Pattern p = Pattern.compile(sregex,
	            Pattern.DOTALL);
	    return p.matcher(content).replaceAll("");
	}

	private static String findScript(String content, String sregex) {
	    Pattern p = Pattern.compile(sregex,
	            Pattern.DOTALL );
	    Matcher matchmaker = p.matcher(content);
	    if (matchmaker.find()) {
	    	return (matchmaker.group(0));
	    }

	    return null;
	}
}
