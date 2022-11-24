import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Tester les opérations arithmétiques de base")
class MathUtilsTest {
    // @BeforeAll : Configurations avant tous les tests(Créer ou se connecter à une
    // base de donées)

    // @BeforeEach : Configurations avant chaque test(créer par exemple l'instance de
    // la class MathUtil)
    // @AfterEach : configurations après chaque test(nettoyage...)
    // @AfterAll : Configurations après tous les tests(Supprimer la base de données)
   private MathUtils mathUtils;
    @BeforeAll
    static void setup(){
        System.out.println("Execution de @BeforAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Execution de @BeforeEach");
         mathUtils=new MathUtils();
    }

    @AfterEach
    void afterEach(){
        System.out.println("Execution de @AfterEach");

    }

    @AfterAll
     static void afterAll(){
        System.out.println("Execution de @AfterAll");
    }

    @DisplayName("Tester la somme de 2 nombres.")
    @Test
    void testAdd(){

        assertEquals(11,mathUtils.add(5,6));
        assertEquals(12,mathUtils.add(8,4));
        assertEquals(-3,mathUtils.add(-6,3));
    }

    @DisplayName("Tester la soustraction de deux valeurs")
    @ParameterizedTest
    @CsvFileSource(resources = "/soustraction.csv" )
    void testSubstraction(int nb1,int nb2,int expectedResult){
//        var nb1=10;
//        var nb2=6;
//        var expectedResult=4;

        assertEquals(expectedResult,mathUtils.substact(nb1,nb2),String.format("%d - %d doit être " +
                "égal à %d",nb1,nb2,expectedResult));
    }
   @DisplayName("Tester le produit de 2 valeus")
   @ParameterizedTest
   @CsvSource({
           "4,2,8",
           "50,2,100",
           "45,2,90",
           "8,8,64"
   })
    void testMultiply(int nb1,int nb2,int expected){
        assertEquals(expected,mathUtils.multiply(nb1,nb2));
   }
   @DisplayName("Tester le rapport entre 2 nombres")
    @Test
    void testDivide(){
        assertEquals(5,mathUtils.divide(10,5));
   }
    @DisplayName("Test si un nombre est pair")
    @ParameterizedTest
    @CsvFileSource(resources = "/isEven.csv")
    void testIfNumberIsEven(int number,boolean expectedResult){
        assertEquals(expectedResult,mathUtils.isEven(number));
    }
    @DisplayName("Test si un nombre est impair")
    @ParameterizedTest
    @CsvFileSource(resources = "/isOdd.csv")
    void testIfNumberIsOdd(int number,boolean expectedResult){
        assertEquals(expectedResult,mathUtils.isOdd(number));
    }
    @DisplayName("Elever un nombre à une puissance donnée")
    @Test
    void power(){
        assertEquals(4,mathUtils.power(2,2));
        assertEquals(16,mathUtils.power(2,4));
    }


}