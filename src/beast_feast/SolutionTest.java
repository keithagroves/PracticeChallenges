package beast_feast;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;
import java.util.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void fixedTest() {
         assertTrue(Kata.feast("great blue heron","garlic nann"));
         assertTrue(Kata.feast("chickadee","chocolate cake"));
         assertTrue(Kata.feast("marmot","mulberry tart"));
         assertTrue(Kata.feast("porcupine","pie"));
         assertTrue(Kata.feast("slow loris","salsas"));
         assertTrue(Kata.feast("ox","orange lox"));
         assertTrue(Kata.feast("blue-footed booby","blueberry"));
         assertFalse(Kata.feast("brown bear","bear claw"));
         assertFalse(Kata.feast("electric eel","lasagna"));
    }
    
    @Test
    public void randomTest() {
      Random r = new Random();
      String beast;
      String dish;
      for(int i = 0; i< 100; i++) {
        beast = "";
        dish = "";
        for(int j = 0; j<10; j++){
          beast += (char) r.nextInt(122 + 1 - 97) + 97;
          dish += (char)  r.nextInt(122 + 1 - 97) + 97;
        }
        assertEquals(feast(beast,dish),Kata.feast(beast,dish));
      }
      
    }
    
    private static boolean feast(String beast, String dish) {
    
    return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    
    }
}