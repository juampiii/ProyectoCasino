package utils;

public class IsNumber {

	public static boolean isNumber(String string) {
	    if (string == null || string.isEmpty()) {
	        return false;
	    }
	    int i = 0;
	    if (string.charAt(0) == '-') {
	        if (string.length() > 1) {
	            i++;
	        } else {
	            return false;
	        }
	    }
	    for (; i < string.length(); i++) {
	        if (!Character.isDigit(string.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}
}
