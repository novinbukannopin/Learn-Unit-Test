package novin.ardian.yee.test;

import org.junit.jupiter.api.*;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Unit-Test
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int counter = 0;

    @Test
    @Order(2)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    void test2() {
        counter++;
        System.out.println(counter);

    }

    @Test
    @Order(3)
    void test1() {
        counter++;
        System.out.println(counter);
    }
}
