import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTeste {

	@Test
	public void test() {
		// Testes passados pelo professor.
		assertTrue(Anagrama.saoAnagramas("", ""));
		assertTrue(Anagrama.saoAnagramas(" ", ""));
		assertTrue(Anagrama.saoAnagramas("a", "a"));
		assertTrue(Anagrama.saoAnagramas("ab", "ab"));
		assertTrue(Anagrama.saoAnagramas("b   a", "ab"));
		assertFalse(Anagrama.saoAnagramas("ba", "a"));
		
		// Testes extras (adiciona teste de maiusculas e minusculas).
		assertTrue(Anagrama.saoAnagramas("AMOR", "roma"));
		assertTrue(Anagrama.saoAnagramas("Raquel", "leuqar  "));
		assertTrue(Anagrama.saoAnagramas("12345", "5 4 3 2 1"));
		assertTrue(Anagrama.saoAnagramas("ned", "enD"));	
		assertFalse(Anagrama.saoAnagramas("bomm", "bom"));
		assertFalse(Anagrama.saoAnagramas("   a", "aa"));
		assertFalse(Anagrama.saoAnagramas("arara", "arrraa"));		
	}
}
