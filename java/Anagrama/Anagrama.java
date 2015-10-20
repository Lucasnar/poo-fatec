import java.util.HashMap;
import java.util.Map;


public class Anagrama {

	public Anagrama() {
		super();
	}

	public static boolean saoAnagramas(String string, String string2) {
		string = string.replace(" ", "").toLowerCase();
		string2 = string2.replace(" ", "").toLowerCase();
		
		if (string.length() != string2.length()) return false;
				
		Map<Character, Integer> caracteres = new HashMap<Character, Integer>();
		
		for (int i = 0, n = string.length(); i < n; i++){
		    char c = string.charAt(i);	
		    if (caracteres.get(c) == null) caracteres.put(c, 1);
		    else {
		    	caracteres.put(c, Integer.valueOf(caracteres.get(c).intValue()) + 1);
		    }
		}
		
		for (int i = 0, n = string2.length(); i < n; i++){
		    char c = string2.charAt(i);	
		    if (caracteres.get(c) == null) return false;
		    else {
		    	caracteres.put(c, Integer.valueOf(caracteres.get(c).intValue()) - 1);
		    }
		}
		
		for (Integer valor : caracteres.values()){
			if (valor.intValue() != 0) return false;			
		}
		
		return true;
	}
}