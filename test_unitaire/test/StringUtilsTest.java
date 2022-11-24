import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @DisplayName("Tester si une chaine est une palindrome")
    @ParameterizedTest
    @CsvFileSource(resources = "/palindrome.csv")
    void testIfStringIsPalindrome(String value, boolean expectedResult){
        assertEquals(expectedResult,StringUtils.isPalindrome(value));
        // Tester une chaine avec les lettres en majusscules

    }


        @DisplayName("Tester si une chaine est une palindrome")
  @Test

    void testIfStringIsPalindrome() {
            // Tester une chaine avec les lettres en majusscules
            assertEquals(true, StringUtils.isPalindrome("Ana"), "Ana est un palindrome");

            //Tester une chaine avec espaces
            assertEquals(true,StringUtils.isPalindrome("an a"),"an a doit etre palindrome");
            assertEquals(true,StringUtils.isPalindrome("a n a"),"a n a doit etre palindrome");
            //Tester une chaines avec des caracteres speciaux
            assertEquals(true,StringUtils.isPalindrome("a-n?a"),"a-n?a doit etre palindrome");
        }


        @DisplayName("Tester si 2 mots sont prefixes")
        @Test
    void testIfStringIsPrefix(){
        // Tester 2 mots en majuscules
            assertEquals(true,StringUtils.isPrefix("APPLE","APP"), "APPLE et APP sont des prefix");
         // Tester un mot en majuscule et un mot miniscule
            assertEquals(true,StringUtils.isPrefix("Apple","APP"), "Apple et APP sont des prefix");
            // Tester 2 mots avec espaces
            assertEquals(true,StringUtils.isPrefix("App le","AP P"), "App le et AP P sont des prefix");
            //Tester 2 mots avec caracteres spéciaux
            assertEquals(true,StringUtils.isPrefix("aPp?le","A,P %P"), "aPp?le et A,P %P sont des prefix");


        }

        @DisplayName("Tester 2 chaines si ils sont des anagrammes")
        @Test
        void TestIfStringIsAnagram(){
            // Tester 2 mots en majuscules
            assertEquals(true,StringUtils.isAnagram("Silent","Listen"), "GARE et RAGE sont des anagrammes");
            //Tester 2 mots avec espaces
            assertEquals(true,StringUtils.isAnagram("GA RE","R AGE"), "GA RE et R AGE sont des anagrammes");
            //Tester 2 mots avec caracteres spéciaux
            assertEquals(true,StringUtils.isAnagram("GA §?RE","Rù% AGE"), "GA §?RE et Rù% AGE sont des anagrammes");
        }
        @DisplayName("Renverser 2 chaines")
    @Test
    void TestStringReversed(){
            // Tester 2 mots en miniscules
            assertEquals("apap",StringUtils.reverseString("papa"));
            // Tester mot en majuscules
            assertEquals("apap",StringUtils.reverseString("PAPA"));
            //Tester mot avec espace
            assertEquals("apap",StringUtils.reverseString("PAP A"));
            //Tester mot avec caracter special
            assertEquals("apap",StringUtils.reverseString("Papa."));

        }


@DisplayName("Renverser un entier")
    @Test
    void TestNumberReversed(){
        // Tester 2 nombres
    assertEquals(89,StringUtils.reverseInt(98));
    // tester  nombre negatif
    assertEquals(-45,StringUtils.reverseInt(-54));
    // tester un nombre avec 0
    assertEquals(2,StringUtils.reverseInt(20));
}

@DisplayName(" Mettre toutes les premieres lettre des mots en majuscules")
@Test
    void TestCapitilizedString(){
        // Tester une chaine qui a deja des majuscules
    assertEquals("LA Vie Est BeLlE",StringUtils.capitalze("lA vie est beLlE"));
    // Tester une chaine avec caractere special
    assertEquals("La Vie Est Belle!",StringUtils.capitalze("la vie est belle!"));
}

@DisplayName("Alterner les caracteres entre un majuscule et un miniscule")
    @Test
    void TestAlternedCharacters(){
        //tester un tab de char
    assertArrayEquals(new char[]{'a','B','c','D'},StringUtils.alternate(new char[]{'a','b','c','d'}));
    //Tester un tab avec caractere special
    assertArrayEquals(new char[]{'a','B','c','D','?'},StringUtils.alternate(new char[]{'a','b','c','d','?'}));


}


@DisplayName("direction")
    @Test
    void TestDirection(){
    //assertArrayEquals(new int[]{-1,2},StringUtils.alternate(new String[]{"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"}));
}

}
