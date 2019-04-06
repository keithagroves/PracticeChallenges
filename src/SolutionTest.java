import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

public class SolutionTest {

    @Test
    public void basicTest() {
        assertEquals(Solution.check(new Object[] {66, 101}, 66), true);
        assertEquals(Solution.check(new Object[] {66, 101}, 66), true);
        assertEquals(Solution.check(new Object[] {78, 117, 110, 99, 104, 117, 107, 115}, 8), false);
        assertEquals(Solution.check(new Object[] {101, 45, 75, 105, 99, 107}, 107), true);
        assertEquals(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
        assertEquals(Solution.check(new Object[] {66, 1,"codewars", 11, "alex loves pushups"}, "alex loves pushups"), true);
        assertEquals(Solution.check(new Object[] {"come", "on", 110, "2500", 10, '!', 7, 15}, "Come"), false);
        assertEquals(Solution.check(new Object[] {"when\'s", "the", "next", "Katathon?", 9, 7}, "Katathon?"), true);
        assertEquals(Solution.check(new Object[] {8, 7, 5, "bored", "of", "writing", "tests", 115}, 45), false);
        assertEquals(Solution.check(new Object[] {"anyone", "want", "to", "hire", "me?"}, "me?"), true);
    }

    @Test
    public void randomTest() {
        Random rand = new Random();
        boolean result = rand.nextBoolean();
        Object[] numbers = new Object[rand.nextInt(50) + 50];
        Object fakeAns = 0;
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000) - 500;
        test: while (!result) {
            fakeAns = rand.nextInt(1000) - 500;
            for (int i = 0; i < numbers.length; i++)
                if (fakeAns == numbers[i])
                    continue test;
            break;
        }
        assertEquals(Solution.check(numbers, result ? numbers[rand.nextInt(numbers.length)] : fakeAns), result);
    }
        
}