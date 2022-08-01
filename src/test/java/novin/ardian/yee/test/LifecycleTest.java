package novin.ardian.yee.test;

import org.junit.jupiter.api.Test;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Unit-Test
 */
public class LifecycleTest {
    private String temp;

    @Test
    void testA() {
        temp = "Novin";

    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}
