package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaExpresion {

	public static boolean validaExpresion(String patron, String cadena) {

	    Pattern pattern = Pattern.compile(patron);
	    // Match the given input against this pattern
	    Matcher matcher = pattern.matcher(cadena);
	    System.out.println(patron);
	    System.out.println(cadena);
	    System.out.println(matcher.matches());
	    return matcher.matches();
	}
}
