package novin.ardian.yee.test;

import novin.ardian.yee.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * @author Novin on 14/07/2022
 * @project Learn-Unit-Test
 */
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each");
    }

    @Test
    public void testDivideSucces() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testAddSucces() {
        var result = calculator.add(10, 10);

        assertEquals(20, result);
    }

    @Test
    @Disabled
    public void testComingSoon() {

    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }
    }

    @Test
    public void testAssumption() {
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }

}
